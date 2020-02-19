public class CompareSolution1 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        String s = (a == 5) ? "Равно" : (a > 5) ? "больше" : "меньше";
        //System.out.println("Число " + s + " 5");
         System.out.printf("Число %s 5\n", s);
    }
}


