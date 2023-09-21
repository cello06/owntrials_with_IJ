package my_week_06;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = input.nextLine();
        System.out.print((isValidPassword(password) ? "Valid" : "Invalid")+" Password");
    }

    public static boolean isValidPassword(String password) {
        if (hasEnoughCharacters(password) &&
                isOnlyFromDigitAndLetters(password) &&
                atLeastTwoDigits(password)) {
            return true;
        }
        return false;
    }

    public static boolean hasEnoughCharacters(String password) {
        return password.length() >= 8;
    }

    public static boolean isOnlyFromDigitAndLetters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean atLeastTwoDigits(String password) {
        int countOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countOfDigits++;
                if (countOfDigits == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
