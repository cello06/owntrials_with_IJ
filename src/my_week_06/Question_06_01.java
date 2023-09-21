package my_week_06;

import java.util.Scanner;

public class Question_06_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many pentagonal numbers that you want to diplay : ");
        int countOfPentagonalNumbers = input.nextInt();
        System.out.print("How many of them that you want to see per line : ");
        int countPerLine = input.nextInt();


        printPentagonalNumbers(countPerLine, countOfPentagonalNumbers);
    }

    public static void printPentagonalNumbers(int countPerLine, int countOfPentagonalNumbers) {
        for (int i = 1; i <= countOfPentagonalNumbers; i++) {
            if (i % countPerLine == 0) {
                System.out.printf("%8d\n", getPetagonalNumber(i));
            } else {
                System.out.printf("%8d", getPetagonalNumber(i));
            }
        }
    }

    public static int getPetagonalNumber(int number){
        int result = number*(3*number -1)/2;
        return result;
    }
}
