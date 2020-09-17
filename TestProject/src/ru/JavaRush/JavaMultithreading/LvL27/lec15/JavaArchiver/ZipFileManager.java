package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

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
}
