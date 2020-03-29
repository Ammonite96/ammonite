package CyberBeatBox.SmallTasks;

import javax.swing.*;
import java.awt.*;

public class RandomColorCircleOnBlackBackground extends JPanel {       //Рисуем на чёрном фоне круг произвольного цвета
    public void paintComponent (Graphics g) {
        g.fillRect(0,0, this.getWidth(), this.getHeight());     // Закрашиваем всю панель черным (цвет по умолчанию). первые два агрумента - координаты, вторые говорят Сделай ширину и высоту как у панели

        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);

        Color randomColor = new Color(red, green, blue); // цвет задаётся в RGB
        g.setColor(randomColor);
        g.fillOval(50, 100, 50, 50);
    }
}
