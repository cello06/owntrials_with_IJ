package my_week_07;

public class QueensPlace {
    public static void main(String[] args) {

        boolean check;
        int[] numbs;
        do {
            numbs = new int[8];
            check = true;
            for (int i = 0; i < numbs.length; i++) {
                int number = (int) (Math.random() * 8);
                int count = 1;
                for (int j = i; 0 < j; j--) {
                    if (number == numbs[j - 1]) {
                        check = false;
                        break;
                    }
                    if (number + count == numbs[j - 1] || number - count == numbs[j - 1]) {
                        check = false;
                        break;
                    } else {
                        count++;
                    }

                }
                if (check) {
                    numbs[i] = number;
                }
            }
        } while (!check);
        for (int numb : numbs) {
            System.out.print("|");
            int count = 0;
            for (int j = 0; j < numb; j++) {
                System.out.print("|");
                count++;
            }
            System.out.print("Q");
            for (int j = count; j < numbs.length; j++) {
                System.out.print("|");
            }
            System.out.println();
        }

    }
}
