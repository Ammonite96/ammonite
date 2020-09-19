package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command.ExitCommand;
import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.exception.WrongZipFileException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import static ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.Operation.*;

public class Archiver {
    public static void main(String[] args) {
        Operation operation = null;

        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException we) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception io) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        } while (operation != EXIT);
    }

    public static Operation askOperation() throws IOException {
        Operation.getAskOperation();

        int numOperation = ConsoleHelper.readInt();
        Operation operation;
        operation = Operation.values()[numOperation];
        return operation;
    }
}

/*
        ConsoleHelper.writeMessage("Выбирите операцию:");
        ConsoleHelper.writeMessage(String.format("%d - упаковать файлы в архив", CREATE.ordinal()));
        ConsoleHelper.writeMessage(String.format("%d - добавить файлв в архив", ADD.ordinal()));
        ConsoleHelper.writeMessage(String.format("%d - удалить файл из архива", REMOVE.ordinal()));
        ConsoleHelper.writeMessage(String.format("%d - распаковать архив", EXTRACT.ordinal()));
        ConsoleHelper.writeMessage(String.format("%d - посмотреть содержимое архива", CONTENT.ordinal()));
        ConsoleHelper.writeMessage(String.format("%d - выход", EXIT.ordinal()));

 */


/*

public static void main(String[] args) {
        Operation operation;

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

 */

