package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String country;
    private String continent;
    private int quantityCitizens;
    private int telephoneCode;
    private String capital;
    private List<String> cities;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getQuantityCitizens() {
        return quantityCitizens;
    }

    public void setQuantityCitizens(int quantityCitizens) {
        this.quantityCitizens = quantityCitizens;
    }

    public int getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(int telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Country() {
        this("Ukraine", "Eurasia", 42000000, 3096, "Kyiv", Arrays.asList("Kyiv", "Zhytomyr", "Vinnytsia"));
    }

    public Country(String country, String continent, String capital, List<String> cities) {
        this(country, continent, 1000000, 12345, capital, cities);
    }

    public Country(String country, String continent, int quantityCitizens, int telephoneCode, String capital, List<String> cities) {
        this.country = country;
        this.continent = continent;
        this.quantityCitizens = quantityCitizens;
        this.telephoneCode = telephoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void addCountry() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;

        System.out.print("Input name of country: ");
        setCountry(scanner.nextLine());

        System.out.print("Input name of continent: ");
        setContinent(scanner.nextLine());

        System.out.print("Input quantity of citizens: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setQuantityCitizens(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.print("Input telephone code: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setTelephoneCode(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.print("Input name of capital: ");
        setCapital(scanner.nextLine());

        System.out.print("Input name of cities divided by , without spaces: ");
        setCities(new ArrayList<>(Arrays.asList(scanner.nextLine().split(","))));
    }

    public void ShowInfo() {
        System.out.println("Country: " + getCountry());
        System.out.println("Continent: " + getContinent());
        System.out.println("Population: " + getQuantityCitizens());
        System.out.println("Telephone code: " + getTelephoneCode());
        System.out.println("Capital: " + getCapital());
        System.out.println("Cities: " + String.join(", ", getCities()));
    }

    public void updateInfo(String country, String continent, String capital) {
        setCountry(country);
        setContinent(continent);
        setCapital(capital);
    }

    public void updateInfo(String country, String continent, String capital, List<String> cities) {
        updateInfo(country, continent, capital);
        setCities(cities);
    }
}
