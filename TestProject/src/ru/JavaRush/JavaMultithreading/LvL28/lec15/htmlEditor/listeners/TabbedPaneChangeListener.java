package ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.listeners;

import ru.JavaRush.JavaMultithreading.LvL28.lec15.htmlEditor.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {   // Слушатель и обработчик изменений состояния панели вкладок
    private View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
