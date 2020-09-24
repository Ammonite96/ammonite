package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.exception.PathIsNotFoundException;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.exception.WrongZipFileException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;       // Полный путь zip файла

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        // Проверяем, существует ли директория, где будет создаваться архив
        // При необходимости создаем ее
        Path pathZip = zipFile.getParent();
        if (Files.notExists(pathZip)) {
            Files.createDirectory(pathZip);
        }

        // Создаем zip поток
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {
            if (Files.isRegularFile(source)) {
                // Если архивируем отдельный файл, то нужно получить его директорию и имя
                addNewZipEntry(zipOutputStream, source.getParent(), source.getFileName());
            } else if (Files.isDirectory(source)) {
                // Если архивируем директорию, то нужно получить список файлов в ней
                FileManager fileManager = new FileManager(source);
                List<Path> fileNames = fileManager.getFileList();
                // Добавляем каждый файл в архив
                for (Path fileName : fileNames) {
                    addNewZipEntry(zipOutputStream, source, fileName);
                }
            } else {
                // Если переданный source не директория и не файл, бросаем исключение
                throw new PathIsNotFoundException();
            }
        }
    }

    private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) {
        try (InputStream inputStream = Files.newInputStream(filePath.resolve(fileName))) {
            ZipEntry zipEntry = new ZipEntry(fileName.toString());
            zipOutputStream.putNextEntry(zipEntry);

            copyData(inputStream, zipOutputStream);

            zipOutputStream.closeEntry();
        } catch (Exception io) {
            io.getStackTrace();
        }
    }

    private void copyData(InputStream in, OutputStream out) throws Exception {
        while (in.available() > 0) {
            out.write(in.read());
            out.flush();
        }
    }

    public List<FileProperties> getFilesList() throws Exception {
        if (!Files.isRegularFile(zipFile)) {
            throw new WrongZipFileException();
        }
        List<FileProperties> fileProperties = new ArrayList<>();
        try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
                copyData(zipInputStream, arrayOutputStream);
                fileProperties.add(new FileProperties(zipEntry.getName(), zipEntry.getSize(),
                        zipEntry.getCompressedSize(), zipEntry.getMethod()));
            }
            zipInputStream.closeEntry();
        } catch (IOException io) {
            io.getStackTrace();
        }
        return fileProperties;
    }

    public void extractAll(Path outputFolder) throws Exception {
        if (Files.notExists(zipFile)) {
            throw new WrongZipFileException();
        }

        Path path = outputFolder.getParent();
        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }

        try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile));
             OutputStream outputStream = Files.newOutputStream(outputFolder)) {

            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null){
                copyData(zipInputStream, outputStream);
            }
            zipInputStream.closeEntry();

        } catch (IOException io) {
            io.getStackTrace();
        }
    }
}


/*

       public void createZip(Path source) {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             InputStream inputStream = Files.newInputStream(source)) {

            ZipEntry zipEntry = new ZipEntry(String.valueOf(source.getFileName()));
            zipOutputStream.putNextEntry(zipEntry);

            while (inputStream.available() > 0) {
                int readFile = inputStream.read();
                zipOutputStream.write(readFile);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


if (!Files.isDirectory(source) && !Files.isRegularFile(source)) {
            throw new PathIsNotFoundException();
        }

 */