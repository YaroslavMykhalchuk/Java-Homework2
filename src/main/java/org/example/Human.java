package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Human {
    private String name;
    private Date birthDay;
    private String telephone;
    private String city;
    private String country;
    private String address;

    public Human() {
        this("Petro", new Date(), "NULL", "Zhytomyr", "Ukraine", "no address");
    }

    public Human(String name, String telephone) {
        this(name, new Date(), telephone, "Zhytomyr", "Ukraine", "no address");
    }

    public Human(String name, String telephone, String city) {
        this(name, new Date(), telephone, city, "Ukraine", "no address");
    }

    public Human(String name, Date birthDay, String telephone, String city, String country, String address) {
        this.name = name;
        this.birthDay = birthDay;
        this.telephone = telephone;
        this.city = city;
        this.country = country;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addHuman() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;
        boolean check = true;

        System.out.print("Input name: ");
        setName(scanner.nextLine());

        System.out.print("Input date of your birth in format DD-MM-YYYY: ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        do {
            try {
                setBirthDay(simpleDateFormat.parse(scanner.nextLine()));
                check = !check;
            } catch (ParseException e) {
                System.out.println("Error date format! Please try again!");
            }
        } while (check);
        check = !check;

        System.out.print("Input telephone: ");
        setTelephone(scanner.nextLine());

        System.out.print("Input city: ");
        setCity(scanner.nextLine());

        System.out.print("Input country: ");
        setCountry(scanner.nextLine());

        System.out.print("Input address: ");
        setAddress(scanner.nextLine());
    }

    public void showHuman() {
        System.out.print("Name: " + getName() + "\n");
        System.out.print("Date of birth: " + getBirthDay() + "\n");
        System.out.print("Telephone: " + getTelephone() + "\n");
        System.out.print("City: " + getCity() + "\n");
        System.out.print("Country: " + getCountry() + "\n");
        System.out.print("Address: " + getAddress() + "\n");
    }

    public void updateInfo(String name) {
        setName(name);
    }

    public void updateInfo(String name, Date birthDay) {
        updateInfo(name);
        setBirthDay(birthDay);
    }

    public void updateInfo(String name, Date birthDay, String telephone) {
        updateInfo(name, birthDay);
        setTelephone(telephone);
    }
}