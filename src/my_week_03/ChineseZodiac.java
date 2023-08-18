package my_week_03;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner intup = new Scanner(System.in);
        System.out.print("Enter a year then learn what is the name of the " +
                " year in Chinese Zodiac :");
        int year = intup.nextInt();
        int chineseYear = year % 12;
        switch (chineseYear) {
            case 0:
                System.out.println("MONKEY");
                break;
            case 1:
                System.out.println("ROOSTER");
                break;
            case 2:
                System.out.println("DOG");
                break;
            case 3:
                System.out.println("PIG");
                break;
            case 4:
                System.out.println("RAT");
                break;
            case 5:
                System.out.println("OX");
                break;
            case 6:
                System.out.println("TIGER");
                break;
            case 7:
                System.out.println("RABBIT");
                break;
            case 8:
                System.out.println("DRAGON");
                break;
            case 9:
                System.out.println("SNAKE");
                break;
            case 10:
                System.out.println("HORSE");
                break;
            case 11:
                System.out.println("SHEEP");
                break;

        }
    }
}
