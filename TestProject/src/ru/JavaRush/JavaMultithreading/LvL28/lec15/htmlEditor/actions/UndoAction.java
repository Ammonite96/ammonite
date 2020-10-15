package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.actions;

import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {  // Класс отмены действия
    private View view;

    public UndoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }
}
