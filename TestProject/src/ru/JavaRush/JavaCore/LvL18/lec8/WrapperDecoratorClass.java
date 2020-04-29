package ru.JavaRush.JavaCore.LvL18.lec8;

import java.util.ArrayList;
import java.util.List;

/**
 * Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
 * Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
 * Метод getHeaderText должен возвращать текст в верхнем регистре - используйте метод toUpperCase().
 */

public class WrapperDecoratorClass {


    public class TableInterfaceWrapper implements TableInterface {
        TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
