package my_week_09;

public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        circle1.setRadius(4.18);
        double area = circle1.getArea();
        System.out.println("Area of circle1 : " + area);
        double perimeter = circle1.getPerimeter();
        System.out.println("Perimeter of circle1 : " + perimeter);
        SimpleCircle circle2 = new SimpleCircle();
        circle2.setRadius(9.321);
        area = circle2.getArea();
        System.out.println("Area of circle2 : " + area);
        perimeter = circle2.getPerimeter();
        System.out.println("Perimeter of circle2 : " + perimeter);

    }
}
 class SimpleCircle {
    private  double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
