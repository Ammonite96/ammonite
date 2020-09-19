package ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver;

import ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.command.*;

import java.util.HashMap;
import java.util.Map;

import static ru.JavaRush.JavaMultithreading.LvL27.lec15.JavaArchiver.Operation.*;

public class CommandExecutor {

    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();
    static {
        allKnownCommandsMap.put(CREATE, new ZipCreateCommand());
        allKnownCommandsMap.put(CONTENT, new ZipContentCommand());
        allKnownCommandsMap.put(EXTRACT, new ZipExtractCommand());
        allKnownCommandsMap.put(ADD, new ZipAddCommand());
        allKnownCommandsMap.put(REMOVE, new ZipRemoveCommand());
        allKnownCommandsMap.put(EXIT, new ExitCommand());
    }

    private CommandExecutor() {

    }

    public static void execute(Operation operation) throws Exception {
        switch (operation) {
            case CREATE:
                allKnownCommandsMap.get(CREATE).execute();
                break;
            case CONTENT:
                allKnownCommandsMap.get(CONTENT).execute();
                break;
            case EXTRACT:
                allKnownCommandsMap.get(EXTRACT).execute();
                break;
            case ADD:
                allKnownCommandsMap.get(ADD).execute();
                break;
            case REMOVE:
                allKnownCommandsMap.get(REMOVE).execute();
                break;
            case EXIT:
                allKnownCommandsMap.get(EXIT).execute();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
