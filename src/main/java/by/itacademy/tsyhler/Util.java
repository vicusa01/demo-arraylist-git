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
}
