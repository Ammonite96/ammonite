package CyberBeatBox.SmallTasks;

import javax.swing.*;

public class SimpleGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();    // Создаём фрейм и кнопку
        JButton button = new JButton("click me");   // Передаём конструктору кнопки текст, который будет на ней отображаться

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Это строка завершает работу программы при закрытиии окна
        frame.getContentPane().add(button);     // Добавляем кнопку на панель фрейма
        frame.setSize(300, 300);    // Присваиваем фрейму размер в пикселях
        frame.setVisible(true);     // Делаем фрейм видимым
    }
}
