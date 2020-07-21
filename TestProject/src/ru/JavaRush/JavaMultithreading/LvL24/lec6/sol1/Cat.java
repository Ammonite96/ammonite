package ru.JavaRush.JavaMultithreading.LvL24.lec6.sol1;

import java.util.Arrays;

/*
В работе вам иногда будет нужно закастить класс к какому-нибудь интерфейсу (тут Sayable),
который не реализован в текущем классе
 */
public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    /**
     * Это - механизм адаптирования к другому интерфейсу - Sayable
     * Внутри метода toSayable создайте class CatPet, реализующий интерфейс Sayable
     * Логика метода say:
     * Если i < 1, то вывести на экран, что кот спит. Пример, "Васька спит."
     * Иначе вывести фразу: "имя_кота говорит мяу!". Пример для i=3, "Васька говорит мяяяу!"
     * <p/>
     * <b>Пример вывода:</b>
     * Мурзик спит.
     * Васька говорит мяяу!
     * Кошка говорит мяяяяяу!
     * Мышь пищит.
     * Томас говорит мяу!
     * <p/>
     *
     * @param i количество букв 'я' в слове мяу
     * @return экземпляр класса CatPet
     */
    public Sayable toSayable(final int i) {
        class CatPet implements Sayable{
            @Override
            public String say() {
                if (i < 1){
                    return name + " спит.";
                }
                if (i >= 1){
                    char[] charsYa = new char[i];
                    for (int j = 0; j < charsYa.length ; j++) {
                        charsYa[j] = 'я';
                    }
                    StringBuilder builder = new StringBuilder("мяу");
                    builder.delete(1,2).insert(1, charsYa);
                    return String.format("%s говорит %s!", name, builder.toString());
                }
                return "";
            }
        }
        return new CatPet();
    }
}
