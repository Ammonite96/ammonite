package Test.Test1;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal(5, "dfg", 2);
        animal.voice();

        System.out.println(animal.toString());

        Cat cat = new Cat(0, "Vasia", 10);
        cat.voice();
        System.out.println(cat.toString());

        Dog dog = new Dog(1, "Tuzik", 15);
        dog.voice();
        System.out.println(dog.toString());

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