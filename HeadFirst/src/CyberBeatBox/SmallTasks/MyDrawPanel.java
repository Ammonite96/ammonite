package CyberBeatBox.SmallTasks;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {       // Наследуемся от JPanel. Виджет который могу добавить на фрейм, как любой другой, только это мой виджет!!
    public void paintComponent (Graphics g) {   // Системный графический метод, который она вызывает сама
        g.setColor(Color.orange);               // Сообщаем какого цвета будет фигура
        g.fillRect(20, 50, 100, 100);   // Координаты и размеры этой фигуры
    }
}
