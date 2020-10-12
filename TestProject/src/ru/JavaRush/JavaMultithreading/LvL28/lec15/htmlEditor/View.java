package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane(); //это будет панель с двумя вкладками.
    private JTextPane htmlTextPane = new JTextPane(); //это будет компонент для визуального редактирования html. Он будет размещен на первой вкладке.
    private JEditorPane plainTextPane = new JEditorPane(); //это будет компонент для редактирования html в виде текста, он будет отображать код html(теги и их содержимое).

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init() {

    }

    public void exit() {
        controller.exit();
    }
}
