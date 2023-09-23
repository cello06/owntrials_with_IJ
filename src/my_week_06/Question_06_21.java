package my_week_06;

import java.util.Locale;
import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String strOfUser = input.nextLine().toUpperCase(Locale.ROOT);
        boolean isNumberValid = isValid(strOfUser);
        if (isNumberValid) {
            String convertedNumber = convertToInternationalNumber(strOfUser);
            System.out.println(convertedNumber);
        } else {
            System.out.println("Invalid input !");
        }
    }


    public static String convertToInternationalNumber(String strToConvert) {
        String converted = "";
        for (int i = 0; i < strToConvert.length(); i++) {
            if (Character.isLetter(strToConvert.charAt(i))) {
                converted += getNumber(strToConvert.charAt(i));
            } else {
                converted += strToConvert.charAt(i);
            }
        }
        return converted;
    }

    public static int getNumber(char letter) {
        int number;
        if (letter >= 'W') {
            number = 9;
        } else if (letter >= 'T') {
            number = 8;
        } else if (letter >= 'P') {
            number = 7;
        } else if (letter >= 'M') {
            number = 6;
        } else if (letter >= 'J') {
            number = 5;
        } else if (letter >= 'G') {
            number = 4;
        } else if (letter >= 'D') {
            number = 3;
        } else {
            number = 2;
        }
        return number;
    }

    public static boolean isValid(String strOfUser) {
        for (int i = 0; i < strOfUser.length(); i++) {
            if (!(Character.isLetter(strOfUser.charAt(i))
                    || Character.isDigit(strOfUser.charAt(i))
                    || strOfUser.charAt(i) == '-')) {
                return false;
            }
        }
        return true;
    }
}
