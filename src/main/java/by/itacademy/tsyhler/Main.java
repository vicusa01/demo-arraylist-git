package by.itacademy.tsyhler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Warsaw");
        cities.add("Minsk");
        cities.add("Ufa");
        cities.add("Praga");
        cities.add("Dubai");
        cities.add("Phuket");
        System.out.println(cities);
        cities.set(1, "Saratov");
        System.out.println(cities);
        String cityWithMaxLength = Util.cityWithMaxLength(cities);
        System.out.println(cityWithMaxLength);
        System.out.println(Util.cityWithMinLength(cities));
        System.out.println(Util.cityStartsWithLetter(cities,'p'));
        System.out.println(Util.cityStartsWithLetter(cities,'P'));
    }
}
