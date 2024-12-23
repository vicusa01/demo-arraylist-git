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
        String cityWithMaxLength = Util.cityWithMaxLength(cities);
        System.out.println(cityWithMaxLength);
    }
}
