package DailyAdvice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"Еште меньшими порциями", "Купите облигающие джынсы", "Два слова: не годится",
            "Будьте честны хотябы сегодня. Скажите своему начальнику всё, что вы *на самом деле* о нём думаете.",
            "Врзможно, вам стоит подобрать другую причёску"};
    String advice;
    public void go(){
        try {
            ServerSocket serverSocket = new ServerSocket(4242); // Благодаря ServerSocket приложение отслеживает клиентские запросы на порт 4242
            while (true) {
                Socket sock = serverSocket.accept(); // Метод accept() блокирует приложение до тех пор пока не поступит запрос, после чег овозвращает сокет(на анонимном порту) для взаимодействия с клиентом
                PrintWriter writer = new PrintWriter(sock.getOutputStream());   // теперь мы используем соединение обьекта Socket с клиентом для создания
                writer.println(advice); // PrintWriter, после чего отправляем с его помощью строку с ответом. затеим закрываем сокет.
                writer.close();
                System.out.println(advice);
            }
        }catch(IOException io){
            io.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int) (Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
