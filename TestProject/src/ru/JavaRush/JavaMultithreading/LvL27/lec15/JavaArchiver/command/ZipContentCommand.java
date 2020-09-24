package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.FileProperties;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");
        ZipFileManager zipFileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Содержимое архива:");
        List <FileProperties> fileProperties = zipFileManager.getFilesList();
        fileProperties.forEach(fProperties -> System.out.println(fProperties.toString()));
        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
