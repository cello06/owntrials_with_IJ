package my_week_11.tests;

import my_week_11.classes.Fruit;
import my_week_11.classes.Apple;
import my_week_11.classes.Orange;

import java.util.ArrayList;

public class TestFruit {
    public static void main(String[] args) {
        ArrayList<String> vitaminsOfApple = new ArrayList<>();
        vitaminsOfApple.add("A");
        vitaminsOfApple.add("B");
        vitaminsOfApple.add("C");
        vitaminsOfApple.add("D");
        Fruit apple = new Apple("Red Delicious", false, "red", "sweet", 15, vitaminsOfApple);
        ArrayList<String> vitaminsOfOrange = new ArrayList<>();
        vitaminsOfOrange.add("C");
        vitaminsOfOrange.add("A");
        Fruit orange = new Orange("Valencia Orange", true, "purple", "juicy", vitaminsOfOrange, 25);
        displayFruit(apple);
        System.out.println("--------------------");
        displayFruit(orange);
        ((Apple) apple).slice();
        System.out.println(((Apple) apple).isSliced());
        ((Orange) orange).peel();
        System.out.println(((Orange) orange).isPeeled());
    }

    public static void displayFruit(Fruit fruit) {
        if (fruit instanceof Apple) {
            System.out.println(((Apple) fruit).getType());
            System.out.println(fruit);
        }
        if ((fruit instanceof Orange)) {
            System.out.println(((Orange) fruit).getType());
            System.out.println(((Orange) fruit).toString());
        }
    }
}
