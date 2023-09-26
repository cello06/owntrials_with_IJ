package my_week_07;

public class Try {
    public static void main(String[] args) {
    int [] numbers = {1,2,3,4,5,6};
    int [] reversedArray = reverseArray(numbers);
        for (int a :
                reversedArray) {
            System.out.println(a);
        }
    }
    public static int[] reverseArray(int [] array){
        int lastIndexOfArray = array.length-1;
        int [] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[lastIndexOfArray];
            lastIndexOfArray--;
        }
        return reversedArray;
    }
}
