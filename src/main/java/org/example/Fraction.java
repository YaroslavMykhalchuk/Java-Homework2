package org.example;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void addFraction() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;

        System.out.print("Input numerator: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setNumerator(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.print("Input denominator: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setDenominator(scanner.nextInt());
        } else {
            System.out.println("Error!");
            return;
        }
    }

    public String showFraction() {
        return getNumerator() + "/" + getDenominator();
    }

    public Fraction add(Fraction obj) {
        int denominator = this.denominator * obj.denominator;
        int numerator = this.numerator * obj.denominator + obj.numerator * this.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction minus(Fraction obj) {
        int denominator = this.denominator * obj.denominator;
        int numerator = this.numerator * obj.denominator - obj.numerator * this.denominator;
        return new Fraction(numerator, denominator);
    }

    public Fraction multiplicate(Fraction obj) {
        int denominator = this.denominator * obj.denominator;
        int numerator = this.numerator * obj.numerator;
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction obj) {
        int denominator = this.denominator * obj.numerator;
        int numerator = this.numerator * obj.denominator;
        return new Fraction(numerator, denominator);
    }

    public void updateFraction(int numerator) {
        setNumerator(numerator);
    }

    public void updateFraction(int numerator, int denominator) {
        updateFraction(numerator);
        setDenominator(denominator);
    }
}
