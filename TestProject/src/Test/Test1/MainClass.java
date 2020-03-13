package Test.Test1;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "Vasia", 10);
        cat.voice();
        System.out.println(cat.getAge() + " " + cat.getName() + " " + cat.getWeight());
    }
}
