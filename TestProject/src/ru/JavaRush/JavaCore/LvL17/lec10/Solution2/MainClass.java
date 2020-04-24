package ru.JavaRush.JavaCore.LvL17.lec10.Solution2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * CrUD Batch - multiple Creation, Updates, Deletion.
 * Программа запускается с одним из следующих наборов параметров:
 * -c name1 sex1 bd1 name2 sex2 bd2 ...  аргументы -с(0) name1(1) sex1(2) bd1(3) name2(4) sex2(5) bd2(6)...
 * -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
 * -d id1 id2 id3 id4 ...
 * -i id1 id2 id3 id4 ...
 *
 * Значения параметров:
 * name - имя, String
 * sex - пол, "м" или "ж", одна буква
 * bd - дата рождения в следующем формате 15/04/1990
 * -с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
 * -u - обновляет соответствующие данные людей с заданными id
 * -d - производит логическое удаление человека с id, заменяет все его данные на null
 * -i - выводит на экран информацию о всех людях с заданными id: name sex bd
 *
 * id соответствует индексу в списке.
 * Формат вывода даты рождения 15-Apr-1990
 * Все люди должны храниться в allPeople.
 * Порядок вывода данных соответствует вводу данных.
 * Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
 * Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
 *
 * Пример вывода для параметра -і с двумя id:
 * Миронов м 15-Apr-1990
 * Миронова ж 25-Apr-1997
 */

public class MainClass {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        allPeople.add(Person.createFemale("Азазель", new Date()));
    }

    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case ("-c"):
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length; i++) {
                            if (args[i].equals("м")) {
                                allPeople.add(Person.createMale((args[i - 1]), dateFormat.parse(args[i + 1])));
                                System.out.println(allPeople.size() - 1);
                            } else if (args[i].equals("ж")) {
                                allPeople.add(Person.createFemale((args[i - 1]), dateFormat.parse(args[i + 1])));
                                System.out.println(allPeople.size() - 1);
                            }
                        }
                    }
                    break;
                case ("-u"):
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i+=4) {
                            Person person;
                            person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(args[i+1]);
                            if (args[i+2].equals("м"))
                                person.setSex(Sex.MALE);
                            else if (args[i+2].equals("ж"))
                                person.setSex(Sex.FEMALE);
                            person.setBirthDate(dateFormat.parse(args[i+3]));
                        }
                    }
                    break;
                case ("-d"):
                    synchronized (allPeople){
                        for (int i = 1; i < args.length; i++){
                            Person person;
                            person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                    break;
                case ("-i"):
                    synchronized (allPeople){
                        for (int i = 1; i < args.length; i++){
                            Person person;
                            person = allPeople.get(Integer.parseInt(args[i]));
                            String date = simpleDateFormat.format(person.getBirthDate());
                            String sex = null;
                            if (person.getSex().equals(Sex.MALE))
                                sex = "м";
                            else if (person.getSex().equals(Sex.FEMALE))
                                sex = "ж";
                            System.out.println(person.getName() + " " + sex + " " + date);
                        }
                    }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //allPeople.forEach(person -> System.out.println(person.getName() + " " + person.getSex() + " " + person.getBirthDate()));
    }
}
