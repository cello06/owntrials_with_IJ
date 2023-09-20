package my_week_06;

public class CodingBatXYBalance {
    public static void main(String[] args) {

    }

    public static boolean xyBalance(String str) {
        int lastIndexOfY;
        int lastIndexOfX;

        if (str.contains("x") && str.contains("y")) {
            lastIndexOfY = str.lastIndexOf('y');
            lastIndexOfX = str.lastIndexOf("x");
            if (lastIndexOfY > lastIndexOfX) {
                return true;
            } else return !str.contains("x");
        }
        return false;
    }
}
