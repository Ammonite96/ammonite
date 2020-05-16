package ru.JavaRush.JavaCore.LvL19.lec3;

import java.util.HashMap;
import java.util.Map;

/**
 * Адаптируй IncomeData к Customer и Contact.
 * Классом-адаптером является IncomeDataAdapter.
 * Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
 * UA Ukraine
 * RU Russia
 * CA Canada
 * Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры).
 * Обратите внимание на формат вывода фамилии и имени человека.
 */

public class AdapterSomeInterface {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        IncomeData data = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "RU";
            }

            @Override
            public String getCompany() {
                return "Ja";
            }

            @Override
            public String getContactFirstName() {
                return "Alex";
            }

            @Override
            public String getContactLastName() {
                return "Agri";
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 1234567;
            }
        };
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(data);
        System.out.println(incomeDataAdapter.getPhoneNumber());
        System.out.println(incomeDataAdapter.getCountryName());

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String number = String.valueOf(data.getPhoneNumber());
            StringBuilder builder = new StringBuilder(number);
            while (builder.length() < 10){
                builder.insert(0, "0");
            }
            String s = builder.substring(0, 3);
            String s1 = builder.substring(3, 6);
            String s2 = builder.substring(6, 8);
            String s3 = builder.substring(8, 10);
            return String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(), s, s1, s2, s3);
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}


/*
"+%d(%2$s)%3$s-%4$s-%5$s"
 */