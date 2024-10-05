import java.util.Scanner;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.author.addBook(this);
    }
    public Book() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        this.title = scanner.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        String authorName = scanner.nextLine();
        this.author = new Author(authorName);

        System.out.print("Ingrese el precio del libro: ");
        this.price = scanner.nextDouble();


        this.author.addBook(this);

        scanner.close();
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author.getName() + ", Price: $" + price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

