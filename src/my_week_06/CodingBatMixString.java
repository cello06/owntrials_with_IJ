package my_week_06;

import java.util.Scanner;

public class CodingBatMixString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String firstString = input.nextLine();
        System.out.print("Enter second string : ");
        String secondString = input.nextLine();
        System.out.println("\n We will mix your strings ---> " + mixString(firstString, secondString));
    }

    public static String mixString(String a, String b) {
        String newStr = "";
        int lengthOfA = a.length();
        int lengthOfB = b.length();
        int countA = 0;
        int countB = 0;

        int countAB = 0;
        while (countA < lengthOfA && countB < lengthOfB) {
            if (countAB % 2 == 0) {
                newStr += "" + a.charAt(countA);
                countA++;
            } else {
                newStr += "" + b.charAt(countB);
                countB++;
            }
            countAB++;
        }
        lengthOfA = lengthOfA - countA;
        lengthOfB = lengthOfB - countB;
        if (lengthOfA != 0) {
            newStr += a.substring(countA);
        }
        if (lengthOfB != 0) {
            newStr += b.substring(countB);
        }
        return newStr;
    }
}
