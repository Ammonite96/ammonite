package ru.JavaRush.JavaCore.LvL20.lec2.Sol1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Реализуй логику записи в файл и чтения из файла для класса Human.
 * Поле name в классе Human не может быть пустым.
 * Метод main реализован только для вас и не участвует в тестировании.
 */

public class MainClass {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("Test", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset( "home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();

            if (ivanov.equals(somePerson))
                System.out.println("Обьекты равны");
            else System.out.println("Херня");

            somePerson.assets.forEach(asset -> System.out.println(asset.getName() + " " + asset.getPrice()));
            System.out.println(somePerson.assets.size());
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }

    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (!Objects.equals(name, human.name)) return false;
            return Objects.equals(assets, human.assets);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            String isName = this.name != null ? "yes" : "no";
            String isAsset = this.assets.size() > 0 ? "yes" : "no";

            writer.println(isName);
            writer.println(isAsset);

            if (isName.equals("yes"))
                writer.println(this.name);

            if (!isAsset.isEmpty()){
                for (Asset asset : assets){
                    writer.println(asset.getName());
                    writer.println(asset.getPrice());
                }
                writer.flush();
                writer.close();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isName = reader.readLine();
            String isAsset = reader.readLine();

            if (isName.equals("yes"))
                this.name = reader.readLine();

            if (isAsset.equals("yes")){
                while (reader.ready()){
                    Asset asset = new Asset(reader.readLine(), Double.parseDouble(reader.readLine()));
                    this.assets.add(asset);
                }
            }
            reader.close();
        }
    }
}
