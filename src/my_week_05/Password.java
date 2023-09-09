package my_week_05;

import java.util.Date;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Date date = new Date();


        final String PASSWORD = "Admin1234";
        final int MAX_TRY = 3;

        boolean isPasswordTrue = true;


        String wrongEnteredTime = "";

        String inputPassword = "";

        int numberOfTry = 1;


        do {

            System.out.print("Could you please enter your password : ");

            inputPassword = input.nextLine();


            if (inputPassword.equals(PASSWORD)) {

                System.out.print("Access Granted\n");

                System.out.println(wrongEnteredTime);

                break;

            } else {

                if (numberOfTry < MAX_TRY) {

                    System.out.printf("Access Denied \nYou have %d rigths left \n", (MAX_TRY - numberOfTry));

                    wrongEnteredTime += numberOfTry + ". Enter attempt with wrong password " + date.toString() + "\n";

                    numberOfTry++;

                } else {

                    isPasswordTrue = false;

                    break;

                }
            }

        } while (numberOfTry <= MAX_TRY);


        if (!isPasswordTrue) {

            System.out.print("Access Denied \n Your account is blocked!!!");

        }


    }
}
