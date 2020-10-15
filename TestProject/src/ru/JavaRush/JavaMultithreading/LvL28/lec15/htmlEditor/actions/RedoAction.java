package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.actions;

import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {    // Класс возврата действия
    private View view;

    public RedoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }
}
