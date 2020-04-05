package Test.Test1;

public class MainClass {
    public static void main(String[] args) {
        Object o = new Animal(5, "Kor", 10);
        ((Animal)o).voice();

        System.out.println(o.toString());

    }
}


/*

Cat cat = new Cat(0, "Vasia", 10);
        cat.voice();
        System.out.println(cat.getAge() + " " + cat.getName() + " " + cat.getWeight());

        Dog dog = new Dog(1);
        dog.voice();
        System.out.println(dog.getAge() + " " + dog.getName() + " " + dog.getWeight());

 */