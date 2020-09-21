package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {
    private ZipFileManager zipFileManager;

    public ZipFileManager getZipFileManager() throws Exception {
        ConsoleHelper.writeMessage("Введите полный путь файла архива");
        Path path = Paths.get(ConsoleHelper.readString());

        return new ZipFileManager(path);
    }
}
