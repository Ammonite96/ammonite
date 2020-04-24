package ru.JavaRush.JavaCore.LvL17.lec10.Solution1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * CrUD - Create, Update, Delete.
 * Программа запускается с одним из следующих наборов параметров:
 * -c name sex bd
 * -u id name sex bd
 * -d id
 * -i id
 *
 * Значения параметров:
 * name - имя, String
 * sex - пол, "м" или "ж", одна буква
 * bd - дата рождения в следующем формате 15/04/1990
 * -c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
 * -u - обновляет данные человека с данным id
 * -d - производит логическое удаление человека с id, заменяет все его данные на null
 * -i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
 *
 * id соответствует индексу в списке.
 * Все люди должны храниться в allPeople.
 * Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
 *
 * Пример параметров:
 * -c Миронов м 15/04/1990
 *
 * Пример вывода для параметра -і:
 * Миронов м 15-Apr-1990
 */

public class MainClass {
    public static List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        allPeople.add(Person.createFemale("Lina", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        if ("-c".equals(args[0])) {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], dateFormat.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            } else {
                if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], dateFormat.parse(args[3])));
                    System.out.println(allPeople.size()-1);
                }
            }
        } else if ("-u".equals(args[0])) {
            Person person;
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setSex(Sex.FEMALE);
            person.setBirthDate(dateFormat.parse(args[4]));
        } else if ("-d".equals(args[0])) {
            Person person1;
            person1 = allPeople.get(Integer.parseInt(args[1]));
            person1.setName(null);
            person1.setBirthDate(null);
            person1.setSex(null);
        } else if ("-i".equals(args[0])) {
            Person person2;
            person2 = allPeople.get(Integer.parseInt(args[1]));
            String date = simpleDateFormat.format(person2.getBirthDate());
            String sex = null;
            if (person2.getSex().equals(Sex.MALE))
                sex = "м";
            else if (person2.getSex().equals(Sex.FEMALE))
                sex = "ж";
            System.out.print(person2.getName() + " " + sex + " " + date);
        }

        System.out.println(allPeople.size());
        System.out.println(allPeople.get(Integer.parseInt(args[3])));
    }
}
