package my_week_07;

import java.util.Random;

public class CountLettersInArray {
    public static void main(String[] args) {
        char[] lowercases = createArray();
        System.out.println("The lowercase letters are : ");
        displayArray(lowercases);

        int[] counts = countLetters(lowercases);

        System.out.println();
        System.out.println("The occuraences of each letter are : ");
        displayCounts(counts);

    }

    public static char[] createArray() {
        char[] array = new char[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (Math.random() * ('z' - 'a') + 'a');
        }
        return array;
    }

    public static void displayArray(char[] array) {
        int count = 1;
        for (char ch :
                array) {
            if (count % 20 == 0) {
                System.out.println(ch+" ");
            } else {
                System.out.print(ch+" ");

            }
            count++;
        }
    }

    public static int[] countLetters(char[] array) {
        int[] counts = new int[26];

        for (int i = 0; i < array.length; i++) {
            counts[array[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        char toShow = 'a';
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char) (toShow + i)+" ");
            } else {
                System.out.print(counts[i] + " " + (char) (toShow + i)+" ");

            }
        }
    }
}
