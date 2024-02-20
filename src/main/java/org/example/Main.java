package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Human human = new Human();
//        human.addHuman();
//        human.showHuman();
//        human.updateInfo("Ivan");
//        human.showHuman();
//        human.updateInfo("Petro", new Date(98, 8, 30));
//        human.showHuman();

//        City city = new City();
//        city.showInfo();
//        city.addCity();
//        city.showInfo();
//        city.updateInfo("Kyiv", "Kyivska");
//        city.showInfo();
//        city.updateInfo("Kryvyi Rig", "Zaporizka", 150000, 12345, 1234);
//        city.showInfo();

//        Country country = new Country();
//        country.ShowInfo();
//        country.addCountry();
//        country.ShowInfo();
//        country.updateInfo("Poland", "Eurasia", "Warszawa");
//        country.ShowInfo();
//        country.updateInfo("Hungary", "Eurasia", "Budapest", Arrays.asList("Buda", "Pest"));
//        country.ShowInfo();

        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(1, 4);

        fraction1.showFraction();
        fraction2.showFraction();

        System.out.print(fraction1.showFraction() + " + " + fraction2.showFraction() + " = " + fraction1.add(fraction2).showFraction());
    }
}