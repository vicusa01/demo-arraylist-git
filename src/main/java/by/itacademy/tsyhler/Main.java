package by.itacademy.tsyhler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Warsaw");
        cities.add("Minsk");
        cities.add("Gomel");
        cities.add("Praga");
        cities.add("Dubai");
        cities.add("Phuket");
        System.out.println(cities);
        cities.set(2, "Saratov");
        System.out.println(cities);

        int maxLength = cities.get(0).length();
        String cityWithMaxLength = cities.get(0);
        for (String city : cities) {
            if (city.length() > maxLength) {
                cityWithMaxLength = city;
                maxLength = cityWithMaxLength.length();
            }
        }
        System.out.println(cityWithMaxLength);
    }
}
