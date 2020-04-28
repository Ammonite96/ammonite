package ru.JavaRush.JavaCore.LvL18.lec8.WrapperDecoratorOutputStream;

import java.io.IOException;

public class Test extends QuestionFileOutputStream {
    public Test(AmigoOutputStream amigoOutputStream) throws IOException {
        super(amigoOutputStream);
    }

    @Override
    public void close() throws IOException {
        super.close();
    }
}
