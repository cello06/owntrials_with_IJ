package my_week_14;

import java.util.Arrays;
import java.util.List;

public class Try {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
        }
        print(array);
        sort(array);
        print(array);

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMax = array[i];
            int currentMaxIndex = i;
            for (int j = i +1; j < array.length; j++) {
                if(array[j] > currentMax){
                    currentMax = array[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex != i){
                array[currentMaxIndex] = array[i];
                array[i] = currentMax;
            }
        }
    }
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
