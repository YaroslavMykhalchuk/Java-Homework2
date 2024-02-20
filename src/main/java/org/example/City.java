package org.example;

import java.util.Scanner;

public class City {
    private String city;
    private String region;
    private String country;
    private int quantityCitizens;
    private int postIndex;
    private int telephoneCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getQuantityCitizens() {
        return quantityCitizens;
    }

    public void setQuantityCitizens(int quantityCitizens) {
        this.quantityCitizens = quantityCitizens;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public int getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(int telephoneCode) {
        this.telephoneCode = telephoneCode;
    }

    public City() {
        this("Zhytomyr", "Zhytomyrska", "Ukraine", 250000, 10020, 412);
    }

    public City(String city, String region, int quantityCitizens, int postIndex, int telephoneCode) {
        this(city, region, "Ukraine", quantityCitizens, postIndex, telephoneCode);
    }

    public City(String city, String region, String country, int quantityCitizens, int postIndex, int telephoneCode) {
        this.city = city;
        this.region = region;
        this.country = country;
        this.quantityCitizens = quantityCitizens;
        this.postIndex = postIndex;
        this.telephoneCode = telephoneCode;
    }

    public void addCity() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;

        System.out.print("Input name of city: ");
        setCity(scanner.nextLine());

        System.out.print("Input name of region: ");
        setRegion(scanner.nextLine());

        System.out.print("Input name of country: ");
        setCountry(scanner.nextLine());

        System.out.print("Input quantity of citizens: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setQuantityCitizens(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println("Input post index: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setPostIndex(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println("Input telephone code: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setPostIndex(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }
    }

    public void showInfo() {
        System.out.println("City: " + getCity());
        System.out.println("Oblast: " + getRegion());
        System.out.println("Country: " + getCountry());
        System.out.println("Quantity of citizens: " + getQuantityCitizens());
        System.out.println("Post index: " + getPostIndex());
        System.out.println("Telephone code: " + getTelephoneCode());
    }

    public void updateInfo(String city, String region) {
        setCity(city);
        setRegion(region);
    }

    public void updateInfo(String city, String region, int quantityCitizens, int postIndex, int telephoneCode) {
        updateInfo(city, region);
        setQuantityCitizens(quantityCitizens);
        setPostIndex(postIndex);
        setTelephoneCode(telephoneCode);
    }
}
