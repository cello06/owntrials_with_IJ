package my_week_05;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");

        String stringOfYourNumber = input.nextLine();

        int lenthOfNumber = stringOfYourNumber.length();



        int integerOfYourNumber = Integer.parseInt(stringOfYourNumber);

        int checkingAmstrongNumber = 0;


        for (int i = 0; i <= lenthOfNumber - 1; i++) {

            checkingAmstrongNumber += Math.pow(stringOfYourNumber.charAt(i) - '0', lenthOfNumber);

        }

        if (checkingAmstrongNumber == integerOfYourNumber) {

            System.out.println("Yes it is an amstrong number ");

        } else {

            System.out.println("No it is not an amstrong number");
        }

    }
}
