package ru.JavaRush.JavaCore.LvL18.lec8.WrapperDecoratorOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {

    AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) throws IOException {
        this.amigoOutputStream = amigoOutputStream;
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String string;

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        string = reader.readLine();
        if (string.equals("Д")){
            amigoOutputStream.close();
        }
    }
}
