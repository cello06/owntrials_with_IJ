package my_week_06;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        System.out.println(number + (isPalindrome(number) ? " is a palindrome" : " is not a palindrome"));
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        String result = "";
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
        return Integer.parseInt(result);
    }
}
