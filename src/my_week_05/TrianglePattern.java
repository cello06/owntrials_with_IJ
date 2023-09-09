package my_week_05;

public class TrianglePattern {
    public static void main(String[] args) {
        System.out.println("Pattern A\n");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.println("\nPattern B\n");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.println("\nPattern C\n");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.println("\nPattern D\n");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 7 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }
}
