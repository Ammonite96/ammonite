package SeaBattleConsole;

import java.util.ArrayList;

public class DotCom {
    // Переменные экземпляра класса DotCom
    private ArrayList<String> locationCells;                                // ArrayList с ячейками, описывающими местоположение.
    private String name;                                                    // имя сайта.

    public void setLocationCells(ArrayList<String> loc) {                   // Сеттер который обновляет положение сайта
                                                                            // (случайный адрес, предоставляемый методом placeDotCom() из класса GameHelper/
        locationCells = loc;
    }

    public void setName(String n) { // Простой сеттер
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index =locationCells.indexOf(userInput);                        // Метод indexOf() из ArrayList в действии! Если ход пользователя совпал с одним из элементов ArrayList,
                                                                            // то метод indexOf() вернет его местоположение. Если нет, то indexOf() вернет -1.
        if (index >= 0) {
            locationCells.remove(index);                                    // Применяем метод remove() для удаления элемента.
            if (locationCells.isEmpty()) {                                  // Используем метод isEmpty(), чтобы проверить все ли адреса были разгаданы.
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + "  :(");     // Сообщаем пользователю о потоплении сайта.
            }else{
                result = "Попал";
            }
        }
        return result;
    }
}
