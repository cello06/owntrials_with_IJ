package my_week_06;

import java.util.Scanner;

public class QuestionLiveClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String strOfUser = input.nextLine();
        System.out.print("Enter how many times you want ot see first word of your string : ");
        int numberOfFirstWord = input.nextInt();

        String firstWord = firstWord(strOfUser);
        printFirstWord(firstWord, numberOfFirstWord);
    }

    public static String firstWord(String sentence) {

        if (sentence.contains(" ")) {
            return sentence.substring(0, sentence.indexOf(" "));
        } else {
            return sentence;
        }
    }

    public static void printFirstWord(String firstWord, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(firstWord);
        }
    }
}
