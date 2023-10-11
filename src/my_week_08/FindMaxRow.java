package my_week_08;

public class FindMaxRow {
    public static void main(String[] args) {
        int[][] numbers = getTwoDimensionArray();
        printNumbers(numbers);
        printMaxRow(numbers);

    }

    public static int[][] getTwoDimensionArray() {
        int[][] numbers = new int[10][10];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = (int) (Math.random() * 10);
            }
        }
        return numbers;
    }

    public static void printNumbers(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + " | ");
                totalOfThisRow += numbers[row][column];
            }
            System.out.print("  sum = " + totalOfThisRow);
            System.out.println("\n---------------------------------------");
        }
    }

    public static void printMaxRow(int[][] numbers) {
        int maxRow = 0;
        int maxRowIndex = 0;

        for (int column = 0; column < numbers[0].length; column++) {
            maxRow += numbers[0][column];
        }

        for (int row = 1; row < numbers.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < numbers[row].length; column++) {
                totalOfThisRow += numbers[row][column];
            }
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                maxRowIndex = row;
            }
        }
        System.out.println("The max row is " + maxRow + " and index of it is " + maxRowIndex);
    }
}
