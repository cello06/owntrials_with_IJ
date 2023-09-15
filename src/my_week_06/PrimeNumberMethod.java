package my_week_06;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prime number that" +
                " you want to see! --> ");
        int numberOfPrime = input.nextInt();
        printPrimeNumber(numberOfPrime);
    }

    public static void printPrimeNumber(int numberOfPrime) {
        int count = 0;
        int number=2;
        while (count < numberOfPrime) {
            if(isPrime(number)){
                System.out.print((count%10==0)?"\n"+number+" ":number+" ");
                count++;
            }
           number++;
        }

    }
    public static boolean isPrime(int number){
        for (int i = 2; i <=number/2 ; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
