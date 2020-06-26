package ru.JavaRush.JavaMultithreading.LvL21.lec8.Sol1;

/**
 * Обеспечь возможность клонирования объекта класса Solution используя глубокое клонирование.
 * Данные в карте users также должны быть клонированы.
 * Не забудь о методах equals и hashCode для корректного добавления элементов типа User в HashMap.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Solution implements Cloneable {

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        for (Map.Entry<String, User> map : this.users.entrySet()) {
            User userOriginal = map.getValue();
            User userClone = new User(userOriginal.age, userOriginal.name);
            solution.users.put(map.getKey(), userClone);
        }
        return solution;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }

    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;


        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
