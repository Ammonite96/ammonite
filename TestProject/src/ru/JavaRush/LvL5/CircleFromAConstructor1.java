package ru.JavaRush.LvL5;

/**
 * Разберись, что делает программа.
 * Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.
 *
 * Подсказка:
 * изучи конструктор по умолчанию.
 */

public class CircleFromAConstructor1 {
    public Color color = new Color();

    public static void main(String[] args) {
        CircleFromAConstructor1 circle = new CircleFromAConstructor1();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public void CircleFromAConstructor1(Color color) {
        color.getDescription();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
