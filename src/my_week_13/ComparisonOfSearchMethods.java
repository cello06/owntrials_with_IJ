package my_week_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparisonOfSearchMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Size of Array : ");

                int size = input.nextInt();
                int[] array = getArray(size);
                System.out.print("Enter what number do you search :");
                int targetNumber = input.nextInt();
                long startTime = System.nanoTime();
                int index = binarySearch(array, targetNumber);
                long finishTime = System.nanoTime();
                long elapsedTime = finishTime - startTime;
                if (index != -1) {
                    System.out.println("With binary search we found " + targetNumber + " number is "
                            + elapsedTime + " nanoseconds in " + index + ". index !");
                }
                startTime = System.nanoTime();
                index = linearSearch(array, targetNumber);
                finishTime = System.nanoTime();
                elapsedTime = finishTime - startTime;
                if (index != -1) {
                    System.out.println("With linear search we found " + targetNumber + " number is "
                            + elapsedTime + " nanoseconds in " + index + ". index !");
                }
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input try again!");
                input.nextLine();
            }
        }
    }

    public static int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target > array[middle]) {
                low = middle + 1;
            } else if (target < array[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
