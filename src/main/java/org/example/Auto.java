package org.example;

import java.util.Scanner;

public class Auto {
    private String name;
    private String manufacturer;
    private int yearManufacturer;
    private double engineCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearManufacturer() {
        return yearManufacturer;
    }

    public void setYearManufacturer(int yearManufacturer) {
        this.yearManufacturer = yearManufacturer;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Auto() {
        this("no name", "no manufacturer", 0, 0);
    }

    public Auto(String name, String manufacturer, int yearManufacturer, double engineCapacity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearManufacturer = yearManufacturer;
        this.engineCapacity = engineCapacity;
    }

    public void addAuto() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;

        System.out.print("Input name auto: ");
        setName(scanner.nextLine());

        System.out.print("Input manufacturer: ");
        setManufacturer(scanner.nextLine());

        System.out.print("Input year of manufacturing: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setYearManufacturer(scanner.nextInt());
            scanner.nextLine();
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.print("Input engine capacity: ");
        isInt = scanner.hasNextDouble();
        if (isInt) {
            setEngineCapacity(scanner.nextDouble());
            scanner.nextLine();
        } else {
            System.out.println("Error!");
            return;
        }
    }

    public void showAuto() {
        System.out.println("\nInput name of auto: " + getName());
        System.out.println("Input name of manufacturer: " + getManufacturer());
        System.out.println("Input year of producing: " + getYearManufacturer());
        System.out.println("Input engine capacity: " + getEngineCapacity() + " l.\n");
    }

    public void updateAuto(String name) {
        setName(name);
    }

    public void updateAuto(String name, int yearManufacturer, double engineCapacity) {
        updateAuto(name);
        setYearManufacturer(yearManufacturer);
        setEngineCapacity(engineCapacity);
    }
}
