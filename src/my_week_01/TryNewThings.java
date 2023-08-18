package my_week_01;

import java.util.Scanner;

public class TryNewThings {
    public static void main(String[] args) {
        numaraAl();

    }


    public static boolean listele(int a, int b, int c) {
        System.out.println("Your numbers are ;" + a + " , " + b + " , " + c + "\n İf you want to sum all of these numbers" +
                "Please enter 1\n\n" + "İf you want to finish the process enter 0");
        Scanner islem = new Scanner(System.in);
        try {
            int istek = islem.nextInt();
            if (istek == 1) return true;
            if (istek == 0) return false;
        } catch (Exception e) {
            System.out.println("Probably you enter Wrong value!!!");
            numaraAl();
        }return false;
    }

    public static void numaraAl(){
        boolean durum=true;
        Scanner input = new Scanner(System.in);
        while(durum==true) {
            System.out.println("Could you please enter three number");
            try {
                int number = input.nextInt();
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                boolean son=listele(number, number1, number2);
                    if(son==true) System.out.println(number+number1+number2);
                    if(son==false) durum=son;
            }catch (Exception e) {
                System.out.println("You enter wrong number");
                input.next();

            }

        }

    }


}