package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.ConsoleHelper;

public class ExitCommand implements Command {

    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
