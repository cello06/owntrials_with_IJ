package my_week_03;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber;
        int onesPlaceOfLotteryNumber;
        int tensPlaceOfLotteryNumber;
        boolean durum = true;
        int money = 200;
        System.out.println("WE only want you to enter a number then earn money!!" +
                "\n Every try charge $100 But don't worry you will earn a lot of money !!" +
                "\nTo quit just enter -1" + "\nTo start you have $100 ");
        while (durum) {

            System.out.print("Enter two digits number and see if you can earn money! ->");
            int number = input.nextInt();
            int onesPlaceOfYourNumber = number % 10;
            int tensPlaceOfYourNumber = number / 10;
            lotteryNumber = (int) (Math.random() * 100);
            onesPlaceOfLotteryNumber = lotteryNumber % 10;
            tensPlaceOfLotteryNumber = lotteryNumber / 10;

            if (number == -1) {
                NumberFormat currenyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
                String formattedAmount = currenyFormatter.format(money);
                System.out.println("Thank you for trial\n\n Your money is " + formattedAmount);
                durum = false;
            } else if (number == lotteryNumber) {
                System.out.println("Conguratulations your reward is  $10,000.");
                money += 10_000;
            } else if (onesPlaceOfYourNumber == tensPlaceOfLotteryNumber && tensPlaceOfYourNumber == onesPlaceOfLotteryNumber) {
                System.out.println("Your digits are matching with our number but row of it is wrong" +
                        " so you earn  $3,000");
                money += 3_000;
            } else if (onesPlaceOfYourNumber == onesPlaceOfLotteryNumber || onesPlaceOfYourNumber == tensPlaceOfLotteryNumber) {
                System.out.println("Only one digit is matching so you earn  $1,000.");
                money += 1_000;
            } else if (tensPlaceOfLotteryNumber == onesPlaceOfLotteryNumber || tensPlaceOfYourNumber == tensPlaceOfLotteryNumber) {
                System.out.println("Only one digit is matching so you earn  $1,000.");
                money += 1_000;
            } else {
                System.out.println(" You fail!!!");

            }
            money = (money - 100);
            if (money < 100) {
                System.out.println("Sorry but you have no enough money");
                durum = false;
            }

        }
    }
}
