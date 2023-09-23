package my_week_06;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long number = input.nextLong();
        double approximatedSquare = sqrt(number);
        System.out.println("The approximated square root of " + number + " is : " + approximatedSquare);
    }

    public static double sqrt(long number) {
        double nextGuess;
        double lastGuess;
        double approximateSquare = 1;
        do {
            lastGuess = approximateSquare;
            nextGuess = (lastGuess + number / lastGuess) / 2;
            approximateSquare = nextGuess;

        } while ((Math.abs(nextGuess - lastGuess)) >= 0.000000001E-10);

        return approximateSquare;

    }
}
