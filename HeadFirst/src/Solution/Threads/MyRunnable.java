package Solution.Threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go(){
        doMore();
    }

    public void doMore(){
        System.out.println("Вершина стрека");
    }

    static class ThreadTestDrive{
        public static void main(String[] args) throws InterruptedException {
            Runnable threadJob = new MyRunnable();
            Thread myThread = new Thread(threadJob);
            myThread.start();
            myThread.join();
            System.out.println("Возвращамеся в метод main");
        }
    }
}
