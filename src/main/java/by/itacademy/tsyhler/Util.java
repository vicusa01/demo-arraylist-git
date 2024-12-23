package by.itacademy.tsyhler;

import java.util.ArrayList;

public class Util {
    static public String cityWithMaxLength(ArrayList<String> cities) {
        int maxLength = cities.get(0).length();
        String cityWithMaxLength = cities.get(0);
        for (String city : cities) {
            if (city.length() > maxLength) {
                cityWithMaxLength = city;
                maxLength = cityWithMaxLength.length();
            }
        }
        return cityWithMaxLength;
    }

    static public String cityWithMinLength(ArrayList<String> cities) {
        int minLength = cities.get(0).length();
        String cityWithMinLength = cities.get(0);
        for (String city : cities) {
            if (city.length() < minLength) {
                cityWithMinLength = city;
                minLength = cityWithMinLength.length();
            }
        }
        return cityWithMinLength;
    }

    static public String cityStartsWithLetter(ArrayList<String> cities,char firstLetter){
        for (String city : cities) {
            if (city.toLowerCase().charAt(0) == firstLetter||city.charAt(0) == firstLetter) {
                return city;
            }
        }
        return "";
    }
}
