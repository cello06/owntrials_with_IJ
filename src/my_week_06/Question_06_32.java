package my_week_06;

public class Question_06_32 {
    public static void main(String[] args) {
        int winNumber = 0;
        for (int i = 1; i <= 10_000; i++) {
            winNumber += playCraps();
        }
        System.out.println("Number of winning games : " + winNumber);

    }

    public static int playCraps() {
        int winNumber = 0;
        int firstDice = rollDice();
        int secondDice = rollDice();
        int sumOfDice = firstDice + secondDice;

        if (sumOfDice == 2
                || sumOfDice == 3
                || sumOfDice == 12) {
            System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sumOfDice);
            System.out.println("You lose");
        } else if (sumOfDice == 7 || sumOfDice == 11) {
            System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sumOfDice);
            System.out.println("You win");
            winNumber++;
        } else {
            System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sumOfDice);
            System.out.println("point is " + sumOfDice);
            int otherSum = 0;
            while (true) {
                firstDice = rollDice();
                secondDice = rollDice();
                otherSum = firstDice + secondDice;

                if (otherSum == sumOfDice) {
                    System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + otherSum);
                    System.out.println("You win");
                    winNumber++;
                    break;
                } else if (otherSum == 7) {
                    System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + otherSum);
                    System.out.println("You lose");
                    break;
                } else {
                    System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + otherSum);
                    System.out.println("point is " + otherSum);
                }
            }
        }
        return winNumber;
    }

    public static int rollDice() {
        int dice = (int) (Math.random() * (7 - 1)) + 1;
        return dice;
    }
}
