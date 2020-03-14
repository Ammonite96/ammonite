package CyberBeatBox.SmallTasks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {    //Реализуем интерфейс (имплементипруем)
    JButton button;     // Кнопка будет передавать события только тем кто реализует ActionListener

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);     //Регистрируем нашу заинтересованность в кнопке. Передаваемы аргумент должен быть обьектом класса реализуемого ActionListener
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {        // Реализуем метод actionPerformed() интерфейса ActionListener. Это фактически метод обработки событий
        button.setText("I`ve been clicked");    // Кнопка вызывает этот метод, чтобы известить о наступлении события. Она отправляет обьект ActionEvent как аргумент, но он нам не нужен. Достаточно знать, что событие произошло
    }
}
