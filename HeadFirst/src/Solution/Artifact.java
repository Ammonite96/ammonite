class Artifact {

    String culture;
    int age;

    static int count = 0;

    public Artifact() {
        count++;
        this.culture = "Неопознаные объекты:  " + "Порядковый номер обьекта: " + count;
    }

    public Artifact(String culture) {
        count++;
        this.culture = "Культура: " + culture + ", " + "Порядковый номер обьекта: " + count;
    }

    public Artifact(String culture, int age) {
        count++;
        this.culture = "Культура: " + culture + ", " + "Порядковый номер обьекта: " + count + ", " + "Век: ";
        this.age = age;
    }

    public static void main(String[] args) {
        Artifact artifact = new Artifact();
        Artifact artifact2 = new Artifact("Ацтеки");
        Artifact artifact4 = new Artifact("Викинги", 12);

        System.out.println(artifact.culture);
        System.out.println(artifact2.culture);
        System.out.println(artifact4.culture + " " + artifact4.age);

    }
}