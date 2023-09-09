package my_week_05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int number = input.nextInt();

        System.out.print("Pow  Number : ");

        int powNumber = input.nextInt();

        int sum = 1;


        for (int i = 1; i <= powNumber; i++) {

            sum *= number;

        }

        System.out.print("Result : " + sum);
    }
}
