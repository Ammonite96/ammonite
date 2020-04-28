package ru.JavaRush.JavaCore.LvL18.lec8.WrapperDecoratorOutputStream;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;

public class MainClass {
    public static void main(String[] args) throws IOException {
       AmigoOutputStream stream = null;
       AmigoOutputStream stream1 = new Test(stream);
       stream1.close();
    }
}
