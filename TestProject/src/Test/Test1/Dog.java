package Test.Test1;

public class Dog extends Animal {


    public Dog() {
        System.out.println("Не опознаная собака");
    }

    public Dog(int age) {
        super(age);
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog(int age, String name, int weight) {
        super(age, name, weight);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
        System.out.print("Собака" + " ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
