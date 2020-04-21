package Solution.Threads.RaceCondition;

public class BankAccount {
    private int balance = 100; // изначально на счету 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public static class RaynAndMonicaJob implements Runnable{ // Будет только один экземплярп каласса, по этому оба потока
        private BankAccount account = new BankAccount(); // будут обращаться к одному банковскому счёту

        public static void main(String[] args) {
            RaynAndMonicaJob theJob = new RaynAndMonicaJob(); // Экземпляр Runnable (задача).
            Thread one = new Thread(theJob); // Создали два потока, оба потока будут работать с одним экземпляром счёта
            Thread two = new Thread(theJob); // account который находится в классе.
            one.setName("Райн");
            two.setName("Моника");
            one.start();
            two.start();
        }

        public void run(){ // в этом метоже поток зацикливается и при каждой итерации пытается снять деньги.
            for (int i = 0; i < 10; i++){ // после снятия он еще раз проверяет баланс, чтобы убедиться что лимит
                makeWithdrawal(10); // не привышен
                if (account.getBalance() < 0)
                    System.out.println("Превышение лимита!");
            }
        }

        private synchronized void makeWithdrawal(int amount){
            if (account.getBalance() >= amount){ // Проверяем баланс и если на счету не достатолчно денег, просто выводим
                System.out.println(Thread.currentThread().getName()+ " Собирается снять деньги"); // сообщение. Если же средств
                try{ // хватает, приостанавливаем поток, затем возобнавляем, чтобы завершить транзакцию.
                    System.out.println(Thread.currentThread().getName()+ " Идёт подремать");
                    Thread.sleep(500);
                }catch (InterruptedException ex){ex.printStackTrace();}
                System.out.println(Thread.currentThread().getName()+ " просыпается");
                account.withdraw(amount);
                System.out.println(Thread.currentThread().getName()+ " Заканчивает транзакцию");
            }
            else
                System.out.println("извините для клиента " + Thread.currentThread().getName() + " недостаточно денег");
        }
    }
}
