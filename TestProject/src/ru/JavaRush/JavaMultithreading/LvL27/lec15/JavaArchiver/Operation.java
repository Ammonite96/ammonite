package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import java.util.Map;
import java.util.TreeMap;

public enum Operation {
    CREATE,     // Создать архив
    ADD,        // Добавить файл в архив
    REMOVE,     // Удалить файл из архива
    EXTRACT,    // Извлечь содержимое архива
    CONTENT,    // Посмотреть содержимое архива
    EXIT;        // Выййти из программы

    private static final Map<Integer, String> askOperation = new TreeMap<>();
    static  {
        askOperation.put(CREATE.ordinal(), "упаковать файлы в архив");
        askOperation.put(ADD.ordinal(), "добавить файл в архив");
        askOperation.put(REMOVE.ordinal(), "удалить файл из архива");
        askOperation.put(EXTRACT.ordinal(), "распаковать архив");
        askOperation.put(CONTENT.ordinal(), "просмотреть содержимое архива");
        askOperation.put(EXIT.ordinal(), "выход");
    }

    public static void getAskOperation(){
        ConsoleHelper.writeMessage("Выберите операцию:");
        askOperation.forEach((integer, s) -> {
            ConsoleHelper.writeMessage(String.format("%d - %s", integer, s));});
    }
}

/*

0 - упаковать файлы в архив
1 - добавить файл в архив
2 - удалить файл из архива
3 - распаковать архив
4 - просмотреть содержимое архива
5 - выход

 */