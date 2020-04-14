package DailyAdvice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public void go(){
        try{
            Socket s = new Socket("127.0.0.1", 4242); // Создаем соединение через сокет к приложению, работающему на том же компе.
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);   // подключаем баферридер к инпутстримридер(который уже соединён с исходящем потоком сокета)

            String advice = reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);
            reader.close();
        }catch (IOException ie){ie.printStackTrace();}
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
