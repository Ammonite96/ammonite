package ru.JavaRush.JavaCore.LvL13.lec11.Weather;

/**
 * 1. В классе Today реализовать интерфейс Weather.
 * 2. Подумай, как связан параметр type с методом getWeatherType().
 * 3. Интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.
 */

public class ClassSolution2 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}
