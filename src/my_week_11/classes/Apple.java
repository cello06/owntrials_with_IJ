package my_week_11.classes;

import java.util.ArrayList;

public class Apple extends Fruit {
    private String type;
    private boolean isSliced;

    public Apple() {
        super("green", "tart", 5);
        this.type = "Granny Smith";
        this.isSliced = false;
    }

    public Apple(String type, boolean isSliced) {
        super("green", "tart", 5);
        this.type = type;
        this.isSliced = isSliced;
    }

    public Apple(String type, boolean isSliced, String color,
                 String taste, int price, ArrayList<String> vitamins) {
        super(color, taste, vitamins, price);
        this.type = type;
        this.isSliced = isSliced;
    }

    public String getType() {
        return type;
    }

    public boolean isSliced() {
        return isSliced;
    }

    public void slice() {
        if (isSliced) {
            System.out.println("It is already sliced !");
        } else {
            this.isSliced = true;
        }
    }

    @Override
    public String toString() {
        return "It is an apple ,\n" +
                "Type   : " + this.type + "\n" +
                super.toString() +
                "\nAnd it is " + ((this.isSliced) ? "" : "not ") + "sliced!";
    }

}
