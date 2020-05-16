package ru.JavaRush.JavaCore.LvL19.lec3.Adapter1;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
