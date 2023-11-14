package my_week_11.classes;

import java.util.ArrayList;

public class Orange extends Fruit {
    private String type;
    private boolean isPeeled;

    public Orange() {
        super("orange", "sweet", 5);
        this.type = "Navel Orange";
        this.isPeeled = false;
    }

    public Orange(String type, boolean isPeeled) {
        super("orange", "sweet", 5);
        this.type = type;
        this.isPeeled = isPeeled;
    }

    public Orange(String type, boolean isPeeled,
                  String color, String taste, ArrayList<String> vitamins, double price) {
        super(color, taste, vitamins, price);
        this.type = type;
        this.isPeeled = isPeeled;
    }

    public String getType() {
        return type;
    }

    public boolean isPeeled() {
        return isPeeled;
    }

    public void peel() {
        if (isPeeled) {
            System.out.println("It is already peeled!");
        } else {
            this.isPeeled = true;
        }
    }

    public String toString() {
        return "It is an orange \n" +
                "Type : " + this.type +"\n"+
                super.toString() +
                "\nAnd it is " + ((isPeeled) ? "" : "not ") + "peeled";
    }
}
