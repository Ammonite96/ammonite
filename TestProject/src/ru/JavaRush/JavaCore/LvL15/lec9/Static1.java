package ru.JavaRush.JavaCore.LvL15.lec9;

import java.util.HashMap;
import java.util.Map;

/**
 * В статическом блоке инициализировать labels 5 различными парами ключ-значение.
 */

public class Static1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.0, "value1");
        labels.put(2.0, "value2");
        labels.put(3.0, "value3");
        labels.put(4.0, "value4");
        labels.put(5.0, "value5");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
