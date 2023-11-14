package my_week_11.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruit {
    private String color;
    private String taste;
    private ArrayList<String> vitamins;
    private double price;

    public Fruit() {
        this.color = "green";
        this.taste = "sweet";
        this.price = 5;
    }

    public Fruit(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    public Fruit(String color, String taste, ArrayList<String> vitamins, double price) {
        this.color = color;
        this.taste = taste;
        this.vitamins = vitamins;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public ArrayList<String> getVitamins() {
        return this.vitamins;
    }

    @Override
    public String toString() {
        return "Color      : " + this.color +
                "\nTaste    : " + this.taste +
                "\nVitamins : " + this.vitamins.toString() +
                "\nPrice    : " + this.price;
    }
}
