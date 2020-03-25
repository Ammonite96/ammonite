package ru.JavaRush.JavaCore.LvL13.lec11.RepcaStoryPPC;

public class Person implements Repkaitem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull (Person person){
        System.out.println(this.getName() + " за " + person.getNamePadezh());
    }
}
