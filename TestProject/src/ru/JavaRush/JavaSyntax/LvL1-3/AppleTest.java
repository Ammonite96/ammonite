public class AppleTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.addPrice(50);
        Apple apple2 = new Apple();
        Apple.addPrice(100);
        Apple apple3 = new Apple();
        Apple.addPrice(150);
        System.out.println("Стоимсость яблок " + Apple.applesPrice);
    }

    static class Apple {
        static int applesPrice = 0;

        static void addPrice(int applesPrice) {
            Apple.applesPrice = Apple.applesPrice + applesPrice;
        }
    }
}
