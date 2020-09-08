package ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.client;

import java.io.IOException;

public class BotClient extends Client {

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return String.format("%s%d", "date_bot_", 0 + (int) (Math.random() * 100));
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            super.processIncomingMessage(message);
            String[] getUserNameAndText = message.split(": ");
        }
    }

    public static void main(String[] args) {
        new BotClient().run();
    }
}
