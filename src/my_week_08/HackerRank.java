package my_week_08;

import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = getArrayFromUser(input);
        String[] result = checkArray(array,input);
        printResult(result);

    }
    public static int[][] getArrayFromUser(Scanner input){
        int countOfRows = input.nextInt();
        int[][] arrays = new int[countOfRows][countOfRows+1];

        for (int i = 0; i < countOfRows; i++) {
            int countOfColumn = input.nextInt();
            int[] row = new int[countOfColumn+1];
            row[0] = countOfColumn;
            for (int j = 1; j < row.length; j++) {
                row[j] = input.nextInt();
            }
            arrays[i] = row;
        }
        return arrays;
    }
    public static String[] checkArray(int[][] array,Scanner input){
        int countOfQuestion = input.nextInt();
        String[] result = new String[countOfQuestion];
        for (int question = 0; question < result.length; question++) {
            int row = input.nextInt();
            int column = input.nextInt();
            if(row -1 >= array.length || column >= array[row-1].length){
                result[question] = "ERROR!";
            }else{
                result[question] = ""+array[row-1][column];
            }
        }
        return result;
    }
    public static void printResult(String[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
