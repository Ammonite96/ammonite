package CyberBeatBox.SmallTasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepaintCircleAfterClickButton implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        RepaintCircleAfterClickButton gui = new RepaintCircleAfterClickButton();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);     //Добавляем слушателя (this) к кнопке

        RandomColorCircleOnBlackBackground drawPanel = new RandomColorCircleOnBlackBackground();

        frame.getContentPane().add(BorderLayout.SOUTH, button);     // Добавляем два виджета, кнопку и панель рисования, в две области фрейма
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        frame.repaint(); // Когда пользователь наживает на кнопку, вызывается метод repaint(). Это значит что метод paintComponent() вызывается для каждого виджета во фрейме.
    }
}
