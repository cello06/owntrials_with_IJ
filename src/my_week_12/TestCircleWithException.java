package my_week_12;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException circle1 = new CircleWithException(-1);
            CircleWithException circle2 = new CircleWithException(5);
            CircleWithException circle3 = new CircleWithException(0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Number of objects created : " +
                CircleWithException.getNumberOfObject());
    }
}
