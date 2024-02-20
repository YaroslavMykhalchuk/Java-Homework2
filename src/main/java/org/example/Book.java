package org.example;

import java.util.Scanner;

public class Book {
    private String name;
    private String fullNameAuthor;
    private int yearPublishing;
    private String publisher;
    private String genre;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullNameAuthor() {
        return fullNameAuthor;
    }

    public void setFullNameAuthor(String fullNameAuthor) {
        this.fullNameAuthor = fullNameAuthor;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book() {
        this("no name", "no author", 0, "no publisher", "no genre", 0);
    }

    public Book(String name, String fullNameAuthor, int yearPublishing, String publisher, String genre, int pages) {
        this.name = name;
        this.fullNameAuthor = fullNameAuthor;
        this.yearPublishing = yearPublishing;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        boolean isInt;

        System.out.print("Input name of book: ");
        setName(scanner.nextLine());

        System.out.print("Input full name of author: ");
        setFullNameAuthor(scanner.nextLine());

        System.out.print("Input year of publishing: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setYearPublishing(scanner.nextInt());
            scanner.nextLine();
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.print("Input name of publisher: ");
        setPublisher(scanner.nextLine());

        System.out.print("Input genre: ");
        setGenre(scanner.nextLine());

        System.out.print("Input quantity of pages: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            setPages(scanner.nextInt());
            scanner.nextLine();
        } else {
            System.out.println("Error!");
            return;
        }
    }

    public void showBook() {
        System.out.println("\nName: " + getName());
        System.out.println("Author: " + getFullNameAuthor());
        System.out.println("Year publishing: " + getYearPublishing());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Genre: " + getGenre());
        System.out.println("Pages: " + getPages() + "\n");
    }

    public void updateBook(String genre, int pages) {
        setGenre(genre);
        setPages(pages);
    }

    public void updateBook(String publisher, String genre, int pages) {
        updateBook(genre, pages);
        setPublisher(publisher);
    }
}
