package ru.JavaRush.JavaMultithreading.LvL25.lec7.sol2;

import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class SocketTask<T> implements CancellableTask<T>{
    private Socket socket;

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        //close all resources here
    }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {
                //close all resources here by using proper SocketTask method
                //call super-class method in finally block
                return false;
            }
        };
    }

    @Override
    public T call() throws Exception {
        return null;
    }
}
