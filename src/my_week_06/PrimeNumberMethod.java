package my_week_06;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prime number that" +
                " you want to see! --> ");
        int numberOfPrime = input.nextInt();
        System.out.print("Now enter how many number that you want to see per line : ");
        int numberPerLine = input.nextInt();
        printPrimeNumber(numberOfPrime,numberPerLine);
    }

    public static void printPrimeNumber(int numberOfPrime,int numberPerLine) {
        int count = 0;
        int number=2;
        while (count < numberOfPrime) {
            if(isPrime(number)){
                if(count%numberPerLine==0){
                    System.out.printf("\n%-5d",number);
                }else{
                    System.out.printf("%-5d",number);
                }
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
