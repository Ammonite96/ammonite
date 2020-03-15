package CyberBeatBox.SmallTasks;

import javax.swing.*;
import java.awt.*;

public class Graphics2DCircle extends JPanel {
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150,150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();    // Создаём фрейм и кнопку
        Graphics2DCircle graph = new Graphics2DCircle();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Это строка завершает работу программы при закрытиии окна
        frame.getContentPane().add(graph);     // Добавляем кнопку на панель фрейма
        frame.setSize(300, 300);    // Присваиваем фрейму размер в пикселях
        frame.setVisible(true);     // Делаем фрейм видимым
    }
}
