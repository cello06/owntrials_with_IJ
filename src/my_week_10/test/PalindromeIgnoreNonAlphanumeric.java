package my_week_10.test;

import java.util.Calendar;
import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string :");
        String userString = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder(userString);
        System.out.println("Ignoring nonalphanumeric characters,\n"+
                "is "+stringBuilder+" a palindrome? ---> "+isPalindrome(stringBuilder));

    }
    public static boolean isPalindrome(StringBuilder stringBuilder){
        String filtered = filter(stringBuilder);
        StringBuilder filteredStrBuilding = new StringBuilder(filtered);

        String reversed = reverse(filteredStrBuilding);

        return reversed.equals(filteredStrBuilding.toString());
    }
    public static String filter(StringBuilder stringBuilder){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(Character.isLetterOrDigit(stringBuilder.charAt(i))){
                result.append(stringBuilder.charAt(i));
            }
        }
        return result.toString();
    }
    public static String reverse(StringBuilder stringBuilder){
        StringBuilder reversed = stringBuilder.reverse();
        return reversed.toString();
    }
}
