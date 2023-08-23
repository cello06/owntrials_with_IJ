package my_week_03;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    static ArrayList<String> comments = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    static boolean durum = true;

    public static void main(String[] args) {
        mainPage();
    }

    public static void mainPage() {

        String name = " ";
        while (durum) {
            System.out.print("WELCOME TO OUR WEB SITE" +
                    "\n\nFirst of all we need to know your name" +
                    "\n\nWhat is your name:");
            name = input.nextLine();
            System.out.printf("Dear %s , to buy something you can press 1" +
                    "\n\n  to make comment on our web site you" +
                    " can press 2" + "\n\n     to quit you can press 0" +
                    "\n\n\n\nTHANK YOU FOR VISITING OUR WEB SITE\n\n" +
                    "What you want :", name);
            int function = input.nextInt();

            switch (function) {
                case 0:
                    durum = false;
                    break;

                case 1:
                    purchasePage(name);
                    break;

                case 2:
                    commentPage(name);
                    break;
            }


        }
    }

    public static void purchasePage(String name) {
        while (true) {
            System.out.println("Welcome Mr. " + name + " to our purchasing page!" +
                    "If you want to return to main page press 0\n" +
                    "If you want to see our comment page press 1\n" +
                    "If you want quit you can press 2");
            int press = input.nextInt();
            if (press == 0) {
                break;
            }
            if (press == 1) {
                commentPage(name);
                continue;
            }
            if (press == 2) return;
        }
    }


    public static void commentPage(String name) {
        while (true) {
            System.out.print("Welcome Mr. " + name + " to our comment page!" +
                    "\n if you want to go to purchase page press 0 "
                    + "\n if you want to continue press 1 "
                    + "\n\n ---------------->  ");
            int command = input.nextInt();
            if (command == 0) {
                break;
            } else if (command == 1) {
                System.out.print("What is your comment about our site :"
                        +"\n\nYou can write ; Best\nGood\nNotBad\nBad\n------> ");

                String comment = input.next();

                commentStore(comment);
                System.out.println("Press any number:");
                input.next();
            } else {
                System.out.println("Wrong integer!!!");
            }
        }
    }

    public static void commentStore(String comment) {

        comments.add(comment);
        while (true) {
            System.out.print("Do you want to see Comments about our page?" +
                    "\nIf you want to see them press 1  " +
                    "\nIf you want to go to main page press 2 " +
                    "\n\n ------------->  ");
            int command = input.nextInt();
            if (command == 1) {
                showComments(comments);
                break;
            } else if (command == 2) {
                return;
            } else System.out.println("Wrong integer!!!");

        }

    }

    public static void showComments(List<String> liste) {
        System.out.println("Comments are like that;");
        for (String comment : liste) {
            System.out.println(comment);
        }
        System.out.println("To go to comment page press 1 -->");
        int command = input.nextInt();
        if (command == 1) {
            return;
        } else System.out.println("Wrong integer!!!");
    }


}



