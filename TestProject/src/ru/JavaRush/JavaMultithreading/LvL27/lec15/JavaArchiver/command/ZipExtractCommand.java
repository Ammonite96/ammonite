package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ZipFileManager;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Распаковка архива.");
            ZipFileManager zipFileManager = getZipFileManager();
            ConsoleHelper.writeMessage("Введите полное имя файла или директории для распаковки архива.");
            Path path = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(path);
            ConsoleHelper.writeMessage("Архив распакован.");
        } catch (PathIsNotFoundException p){
            ConsoleHelper.writeMessage("Вы неверно указали имя файла или директории.");
        }
    }
}
