package my_week_03;

import java.util.Scanner;

public class RandomTry {
    public static void main(String[] args) {
        boolean durumEasy = true;
        boolean durumHard = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Answer the questions.\n\n" +
                "Untill you enter wrong answer we will ask you questions.\n\n" +
                "When you finish we will tell you your score\n\n" +
                "WE WISH YOU CAN TAKE GOOD POINT!!!");
        int number1;
        int number2;
        int number3;
        int number4;
        int score = 0; //you take one point for every true answer.
        while (durumEasy) {
            number1 = (int) (Math.random() * 10) + 10;
            number2 = (int) (Math.random() * 10) + 10;
            System.out.print("\n\n " + number1 + " + " + number2 + " = ");
            int answer = input.nextInt();
            if (answer == number1 + number2) {
                score++;
            }
            if (answer != number1 + number2) {
                System.out.println("sorry it is a wrong answer and your point is " + score);
                durumEasy = false;
            }
            if (score == 5) {
                System.out.println("Congratulations".toUpperCase() + " now it is harder!!!");
                durumEasy = false;
            }


        }
        while (durumHard) {
            number3 = (int) (Math.random() * 20);
            number4 = (int) (Math.random() * 20);
            if (number3 < number4) {
                int temp = number3;
                number3 = number4;
                number4 = temp;
            }
            System.out.print("\n\n " + number3 + " - " + number4 + " = ");
            int answer = input.nextInt();
            if (answer == number3 - number4) {
                score++;
            }
            if (answer != number3 - number4) {
                System.out.println("sorry it is a wrong answer and your point is " + score);
                durumHard = false;
            }
            if (score == 20) {
                System.out.println("\n\n\nCONGRATULATIONS YOU PASS THE EXAM!!");
                durumHard = false;
            }
        }
    }
}
