package ru.JavaRush.JavaCore.LvL19.lec3.Adapter;

import java.io.IOException;

public interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}
