package my_week_06;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        long number = input.nextInt();

        int sumOfDigit = sumDigits(number);
        System.out.println("The sum of the digits in " + number + " is " + sumOfDigit);
    }

    public static int sumDigits(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
