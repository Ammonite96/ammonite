package CyberBeatBox.SmallTasks;

import javax.swing.*;
import java.awt.*;

public class JpegOnMyPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("test.jpg").getImage();
        g.drawImage(image, 3, 4, this);     // 3 пикселя от левого края, 4 пикселя от верхнего.
    }
}
