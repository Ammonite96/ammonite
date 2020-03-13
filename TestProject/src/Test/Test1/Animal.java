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
    }

    public void setWeight(int weight) {
        if (weight <= 0)
            this.weight = 1;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.setAge(age);
    }

    public Animal(int age, String name) {
        this.setAge(age);
        this.name = name;
    }

    public Animal(int age, String name, int weight) {
        this.setAge(age);
        this.name = name;
        this.weight = weight;
    }



    public void voice(){
        System.out.println("подаёт голос");
    }
}
