package my_week_05;

public class NewTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int k = 1; k <=6-i ; k++) {
                System.out.print("  ");
            }
            for (int m = 1; m <=7-i ; m++) {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
