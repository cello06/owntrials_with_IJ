package my_week_07;

import java.util.Scanner;

public class RemoveTen {
    public static void main(String[] args) {
        int[] list = getList();
        list = removeTens(list);
        printList(list);
    }

    public static int[] getList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers : ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static int[] removeTens(int[] list) {
        int[] result = new int[list.length];
        int countIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 10) {
                result[countIndex] = list[i];
                countIndex++;
            }
        }
        return result;
    }

    public static void printList(int[] list) {
        System.out.print("New List ---> ");
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
