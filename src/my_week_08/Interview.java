package my_week_08;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        print(matrix);
        rotate(matrix);
        print(matrix);
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of a matrix : ");
        int length = input.nextInt();

        int[][] matrix = new int[length][length];
        System.out.println("Fill the matrix");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void rotate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = row; column < matrix[row].length; column++) {
                if (row != column) {
                    int temp = matrix[row][column];
                    matrix[row][column] = matrix[column][row];
                    matrix[column][row] = temp;
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column <= matrix[row].length / 2; column++) {
                int temp = matrix[row][column];
                matrix[row][column] = matrix[row][matrix[row].length - column - 1];
                matrix[row][matrix[row].length - column - 1] = temp;
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%4d", matrix[row][column]);
            }
            System.out.println();
        }
        System.out.println("====================");
    }

}
