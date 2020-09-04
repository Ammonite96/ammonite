package ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static ru.JavaRush.JavaMultithreading.LvL26.lec15.JavaChat.MessageType.*;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Socket socketClient = serverSocket.accept();
                Handler handler = new Handler(socketClient);
                handler.start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Произошла ошибка");
            e.printStackTrace();
        }
    }

    public static void sendBroadcastMessage(Message message) {
        connectionMap.forEach((s, connection) -> {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Сообщение не отправленно");
                e.printStackTrace();
            }
        });
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message responseName;
            while (true) {
                connection.send(new Message(NAME_REQUEST));
                responseName = connection.receive();
                if (responseName.getType() != USER_NAME) {
                    continue;
                }
                if (connectionMap.containsKey(responseName.getData())) {
                    continue;
                }
                if (responseName.getData() == null) {
                    continue;
                }
                if (responseName.getData().isEmpty()) {
                    continue;
                }
                break;
            }
            connectionMap.put(responseName.getData(), connection);
            connection.send(new Message(NAME_ACCEPTED));
            return responseName.getData();
        }

        private void notifyUsers(Connection connection, String name) {
            connectionMap.forEach((s, connection1) -> {
                try {
                    if (s != name) {
                        connection.send(new Message(USER_ADDED, s));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message response = connection.receive();
                if (response.getType() == TEXT) {
                    String data = String.format("%s: %s", userName, response.getData());
                    sendBroadcastMessage(new Message(TEXT, data));
                } else {
                    ConsoleHelper.writeMessage("Ошибка, сообщение не является текстом");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage(String.valueOf(socket.getRemoteSocketAddress()));
            try (Connection connection = new Connection(socket)){
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);

                if (userName != null || !(userName.isEmpty())){
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(USER_REMOVED, userName));
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                ConsoleHelper.writeMessage(String.valueOf(socket.isClosed()));
            }
        }
    }
}
