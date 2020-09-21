package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.exception.PathIsNotFoundException;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {

        Path pathZip = zipFile.getParent();
        if (Files.notExists(pathZip)) {
            Files.createDirectory(pathZip);
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {
            if (Files.isRegularFile(source)) {
                addNewZipEntry(zipOutputStream, source.getParent(), source.getFileName());
            } else if (Files.isDirectory(source)) {
                FileManager fileManager = new FileManager(source);
                List<Path> fileNames = fileManager.getFileList();
                for (Path fileName : fileNames) {
                    addNewZipEntry(zipOutputStream, source, fileName);
                }
            } else {
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