package ru.JavaRush.JavaCore.LvL17.lec4;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, не this
 * 2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized
 */

public class Synchronized1MainClass {

    public static void main(String[] args) {
        Note note = new Note();
        Thread thread = new Thread();
        Thread thread1 = new Thread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            note.addNote(i, "Note" + i);
            System.out.println(note.notes.toString());
        }
        thread1.start();
        for (int i = 0; i < note.notes.size(); i++) {
            note.removeNote(i);
            System.out.println(note.notes.toString());
        }


    }

    public static class Note implements Runnable {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }

        @Override
        public void run() {

        }
    }
}
