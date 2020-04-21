package Solution.Threads;

public class TestSync implements Runnable {
    private int balance;
    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            increment();
            System.out.println("Баланс равен " + balance);
        }
    }

    public synchronized void increment(){
        int i = balance;
        balance = i +1;
    }

    public static class TestSyncTest{
        public static void main(String[] args) {
            TestSync testSync = new TestSync();
            Thread one = new Thread(testSync);
            Thread two = new Thread(testSync);
            one.start();
            two.start();
        }
    }
}
