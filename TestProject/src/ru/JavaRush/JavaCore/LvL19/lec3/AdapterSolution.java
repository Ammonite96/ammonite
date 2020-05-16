package ru.JavaRush.JavaCore.LvL19.lec3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Адаптировать Customer и Contact к RowItem.
 * Классом-адаптером является DataAdapter.
 * Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
 * UA Ukraine
 * RU Russia
 * CA Canada
 */

public class AdapterSolution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return "Eh";
            }

            @Override
            public String getCountryName() {
                return "Russia";
            }
        };
        Contact contact = new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                return "+38(050)123-45-67";
            }
        };

        DataAdapter adapter = new DataAdapter(customer, contact);
        System.out.println(adapter.getCountryCode());
        adapter.getContactFirstName();
        adapter.getDialString();
        System.out.println(adapter.getCompany());
        System.out.println(adapter.getDialString());
    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryCode = null;
            for (Map.Entry<String, String> pair : countries.entrySet()){
                String key = pair.getKey();
                String value = pair.getValue();
                if(customer.getCountryName().equals(value))
                    countryCode = key;
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] lastAndFirstName = contact.getName().split(", ");
            return lastAndFirstName[1];
        }

        @Override
        public String getContactLastName() {
            String[] lastAndFirstName = contact.getName().split(", ");
            return lastAndFirstName[0];
        }

        @Override
        public String getDialString() {
            String phoneNumber = contact.getPhoneNumber().replaceAll("[()-]", "");
            return "callto://"+phoneNumber;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}
