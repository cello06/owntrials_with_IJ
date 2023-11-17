package my_week_12;

public class CircleWithException {
    private double radius;
    private static int numberOfObject;

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObject++;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius can not be negative");
        }
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

}
