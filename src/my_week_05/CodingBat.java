package my_week_05;

public class CodingBat {
    public static void main(String[] args) {
     int nearest = close10(8,13);
        System.out.println(nearest);
    }
    public static int close10(int a, int b) {
        int differanceAWithTen = Math.abs(10-a);
        int differanceBWithTen = Math.abs(10-b);

        return (differanceAWithTen>differanceBWithTen)?b:a;
    }

}
