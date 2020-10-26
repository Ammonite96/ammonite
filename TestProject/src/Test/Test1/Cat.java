package Test.Test1;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age) {
        super(age);
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat(int age, String name, int weight) {
        super(age, name, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
        System.out.print("Кот" + " ");
    }
}
