package my_week_03;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        boolean durum = true;
        Scanner input = new Scanner(System.in);
        while (durum == true) {
            System.out.print("Enter a number :");
            int number = input.nextInt();
            if (number % 5 == 0) {
                System.out.println("HiFive");
            }
            if (number % 2 == 0) {
                System.out.println("HiEven");
            }
            if (number == 0) durum = false;

        }
    }
}
