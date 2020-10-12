package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.listeners;

import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }
}
