package my_week_05;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        //If a string contains a digit, print the char coming after that digit as many times as the value of the digit.
        //The given string won't have a digit at last index
        //The string will always have a char after a digit
        //a2pp3le --> pplll
        //b2a3nana --> aannn
        //i2n2a2r --> nnaarr

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String yourStr = input.nextLine();

        String newStr = "";

        int indexOfNumber = 0;

        for (int i = 0; i <= yourStr.length() - 1; i++) {
            if (Character.isDigit(yourStr.charAt(i))) {

                indexOfNumber = Integer.parseInt("" + yourStr.charAt(i));

                for (int j = 1; j <= indexOfNumber; j++) {

                    newStr += yourStr.charAt(i + 1);

                }
            }

        }
        System.out.println(newStr);
    }
}
