package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        ZipFileManager zipFileManager;
        ConsoleHelper.writeMessage("Введите полный путь архива (куда сохранять! Имя архива входит в состав пути.)");
        try (BufferedReader pathFileReader = new BufferedReader(new InputStreamReader(System.in))) {

            String pathFileForArchive = pathFileReader.readLine();
            zipFileManager = new ZipFileManager(Paths.get(pathFileForArchive));

            ConsoleHelper.writeMessage("Введите путь к файлу, который будем архивировать.");
            String pathFileCreateZip = pathFileReader.readLine();
            zipFileManager.createZip(Paths.get(pathFileCreateZip));

            new ExitCommand().execute();

        } catch (Exception io) {
            io.getStackTrace();
        }

    }
}

