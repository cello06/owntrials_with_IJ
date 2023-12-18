package my_week_14;

public class BubbleSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 6, 8, 9, 4, 3, 2, 1};
        print(array);
        bubbleSort(array);
        print(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
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
