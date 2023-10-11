package my_week_08;

public class Shuffling {
    public static void main(String[] args) {
        int[][] numbers = getArray();
        printArray(numbers);
        shuffle(numbers);
        printArray(numbers);
    }

    public static int[][] getArray() {
        int[][] numbers = new int[10][10];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = column;
            }
        }
        return numbers;
    }

    public static void shuffle(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                int x = (int) (Math.random() * numbers.length);
                int y = (int) (Math.random() * numbers[row].length);

                int temp = numbers[row][column];
                numbers[row][column] = numbers[x][y];
                numbers[x][y] = temp;
            }
        }
    }

    public static void printArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("============================");
    }
}
