package ru.JavaRush.JavaMultithreading.LvL21.lec10.Sol3;

public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}
