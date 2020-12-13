package test9;

import java.awt.*;

public class Book {
    private String title;
    private double price;
    private Class1 person;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Class1 getPerson() {
        return person;
    }

    public void setPerson(Class1 person) {
        this.person = person;
    }

    public Book(String title, float price){
        this.setTitle(title);
        this.setPrice(price);
    }
}
