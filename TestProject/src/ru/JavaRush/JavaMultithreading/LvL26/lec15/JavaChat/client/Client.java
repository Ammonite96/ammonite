package ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.client;

import ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.Connection;
import ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.ConsoleHelper;
import ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.Message;
import static ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.MessageType.TEXT;

import java.io.IOException;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() {
        ConsoleHelper.writeMessage("Введите адрес сервера");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Введите порт сервера");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        ConsoleHelper.writeMessage("Введите своё имя");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(TEXT ,text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Произошла ошибка ввода/вывода");
            e.printStackTrace();
            clientConnected = false;
        }
    }

    public class SocketThread extends Thread {
        @Override
        public void run() {
            getSocketThread().setDaemon(true);
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SocketThread socketThread = new Client().new SocketThread();
        socketThread.run();
    }
}
