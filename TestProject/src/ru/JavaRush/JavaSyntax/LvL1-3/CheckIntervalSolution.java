public class CheckIntervalSolution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
        checkInterval(77);
    }

    public static void checkInterval(int a) {
        if (50 <= a & a <= 100)
            System.out.println("Число " + a + " содержится в интервал");
        else
            System.out.println("Число " + a + " не содержится в интервале");

    }
}
