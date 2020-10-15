package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.listeners;

import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class UndoMenuListener implements MenuListener {
    private View view;

    private JMenuItem undoMenuItem;     // Пункт меню "Отменить"
    private JMenuItem redoMenuItem;     // Пункт меню "Вернуть"

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    @Override
    public void menuSelected(MenuEvent e) {     // Он будет вызываться перед показом меню
        boolean canUndo = view.canUndo();
        undoMenuItem.setEnabled(canUndo);

        boolean canRedo = view.canRedo();
        redoMenuItem.setEnabled(canRedo);
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
