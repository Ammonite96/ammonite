package Test.Test1;

public class Animal {
    private int age;
    private String name;
    private int weight;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age <= 0)
            this.age = 1;
        else this.age = age;
    }

    public void setWeight(int weight) {
        if (weight <= 0)
            this.weight = 1;
        else this.weight = weight;
    }

    public Animal() {
        System.out.println("не опознаное животное");
    }

    public Animal(int age) {
        setAge(age);
    }

    public Animal(int age, String name) {
        setAge(age);
        this.name = name;
    }

    public Animal(int age, String name, int weight) {
        setAge(age);
        this.name = name;
        setWeight(weight);
    }



    public void voice(){
        System.out.println("подаёт голос");
    }
}
