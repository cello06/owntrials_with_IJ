package my_week_08;

import java.util.Scanner;

public class GuessBirthdayUsingArray {
    public static void main(String[] args) {
        int[][][] dates = getDates();
        guess(dates);
    }

    public static void guess(int[][][] dates) {
        Scanner input = new Scanner(System.in);
        int answer;
        int birthDay = 0;

        for (int set = 0; set < dates.length; set++) {
            System.out.println("Is your birth day in this set(" + (set + 1) + " :");
            for (int row = 0; row < dates[set].length; row++) {
                for (int day = 0; day < dates[set][row].length; day++) {
                    System.out.printf("%4d", dates[set][row][day]);
                }
                System.out.println();
            }
            System.out.println("If you see you birth day press 1, if you do not see press 0 :");
            answer = input.nextInt();
            if (answer == 1) {
                birthDay += dates[set][0][0];
            }
        }
        System.out.println("Your birthday is " + birthDay);
    }

    public static int[][][] getDates() {
        return new int[][][]{
                {{1, 3, 5, 7},
                        {9, 11, 13, 15},
                        {17, 19, 21, 23},
                        {25, 27, 29, 31}},
                {{2, 3, 6, 7},
                        {10, 11, 14, 15},
                        {18, 19, 22, 23},
                        {26, 27, 30, 31}},
                {{4, 5, 6, 7},
                        {12, 13, 14, 15},
                        {20, 21, 22, 23},
                        {28, 29, 30, 31}},
                {{8, 9, 10, 11},
                        {12, 13, 14, 15},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}},
                {{16, 17, 18, 19},
                        {20, 21, 22, 23},
                        {24, 25, 26, 27},
                        {28, 29, 30, 31}}};
    }
}
