package ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
        return String.format("%s%d", "date_bot_", (int) (Math.random() * 100));
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
            String name = null;
            String messageText;
            SimpleDateFormat simpleDateFormat = null;

            if (message.contains(":")) {
                name = message.substring(0, message.indexOf(":")).trim();
                messageText = message.substring(message.indexOf(":") + 1).trim();

                switch (messageText) {
                    case "дата":
                        simpleDateFormat = new SimpleDateFormat("d.MM.YYYY");
                        break;
                    case "день":
                        simpleDateFormat = new SimpleDateFormat("d");
                        break;
                    case "месяц":
                        simpleDateFormat = new SimpleDateFormat("MMMM");
                        break;
                    case "год":
                        simpleDateFormat = new SimpleDateFormat("YYYY");
                        break;
                    case "время":
                        simpleDateFormat = new SimpleDateFormat("H:mm:ss");
                        break;
                    case "час":
                        simpleDateFormat = new SimpleDateFormat("H");
                        break;
                    case "минуты":
                        simpleDateFormat = new SimpleDateFormat("m");
                        break;
                    case "секунды":
                        simpleDateFormat = new SimpleDateFormat("s");
                        break;
                    default:
                        simpleDateFormat = null;
                }
            }

            if (simpleDateFormat != null && name != null) {
                Calendar calendar = Calendar.getInstance();
                String result = "Информация для " + name + ": ";
                result += simpleDateFormat.format(calendar.getTime());
                sendTextMessage(result);
            }
        }
    }

    public static void main(String[] args) {
        new BotClient().run();
    }
}
