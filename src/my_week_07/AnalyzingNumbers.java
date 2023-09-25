package my_week_07;

import java.util.Scanner;

public class AnalyzingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count of the numbers : ");
        int countOfNumbers = input.nextInt();

        double [] numbers = new double[countOfNumbers];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1)+". number --> ");
            numbers[i] = input.nextDouble();
        }
        double average = getAverage(numbers);
        System.out.println("Average is :"+average);

        System.out.println("Numbers bigger than average :");
        int countOfNumbersBiggerThanAverage = 0;
        for (double number :
                numbers) {
            if (number > average) {
                System.out.print(number+" ");
                countOfNumbersBiggerThanAverage++;
            }
        }
        System.out.println("\nCount of numbers bigger than average :"+countOfNumbersBiggerThanAverage);
    }
    public static double getAverage(double [] numbers){
        double average = 0;
        double sum = 0;

        for (double number :
                numbers) {
            sum += number;
        }
        average = sum / numbers.length;
        return average;
    }
}
