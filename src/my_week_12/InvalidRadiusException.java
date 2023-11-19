package my_week_12;

public class InvalidRadiusException extends Exception{
    private double radius;
    public InvalidRadiusException(double radius){
        super(radius+" is an invalid radius");
        this.radius =radius;
    }
    public double getRadius(){
        return radius;
    }
}
