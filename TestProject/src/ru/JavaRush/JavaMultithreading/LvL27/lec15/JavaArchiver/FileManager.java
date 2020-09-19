package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path rootPath;
    private List<Path> fileList;

    public FileManager(Path rootPath) throws IOException {
        this.rootPath = rootPath;
        this.fileList = new ArrayList<>();
    }

    public void setFileList(List<Path> fileList) {
        this.fileList = fileList;
    }

    public void collectFileList(Path path) throws IOException {

    }
}
