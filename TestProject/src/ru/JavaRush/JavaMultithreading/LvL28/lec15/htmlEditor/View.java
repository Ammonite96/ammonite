package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor;

import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.listeners.FrameListener;
import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
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
        initGui();
        FrameListener listener = new FrameListener(this);
        addWindowListener(listener);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void exit() {
        controller.exit();
    }

    public void initMenuBar() {         // отвечаепт за инициализацию меню

    }

    public void initEditor() {          // отвечает за инициализацию пеанелей редактора
        htmlTextPane.setContentType("text/html");
        JScrollPane htmlScrollPane = new JScrollPane(htmlTextPane);
        tabbedPane.addTab("HTML", htmlScrollPane);
        JScrollPane plainScrollPane = new JScrollPane(plainTextPane);
        tabbedPane.addTab("Текст", plainScrollPane);
        tabbedPane.setPreferredSize(new Dimension(300, 300));
        TabbedPaneChangeListener changeListener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(changeListener);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

    }

    public void initGui() {             // отвечает за инициализацию графического интерфейса
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged() {

    }
}
