package my_week_05;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String yourStr = input.nextLine();

        int indexOfSpace = 0;

        String firstPartOfStr = "";

        String newFirstPartOfStr = "";

        String secondPartOfStr = "";

        String newSecondPartOfStr = "";


        for (int i = 0; i < yourStr.length() - 1; i++) {

            if (yourStr.charAt(i) == ' ') {

                indexOfSpace = i;
            }
        }

        firstPartOfStr = yourStr.substring(0, indexOfSpace);

        secondPartOfStr = yourStr.substring(indexOfSpace + 1);


        for (int i = 1; i <= firstPartOfStr.length(); i++) {

            newFirstPartOfStr += firstPartOfStr.charAt(firstPartOfStr.length() - i);
        }

        for (int i = 1; i <= secondPartOfStr.length(); i++) {

            newSecondPartOfStr += secondPartOfStr.charAt(secondPartOfStr.length() - i);

        }

        System.out.println(newFirstPartOfStr + " " + newSecondPartOfStr);
    }
}
