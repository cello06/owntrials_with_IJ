package my_week_09;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class TryLibraries {
    public static void main(String[] args) {
        double[][] points = getPoints();
        double[][] closestPoints = findClosestPoints(points);

    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter number of points :");
        int countsOfPoints = input.nextInt();



        double[][] points = new double[countsOfPoints][2];
        for (int point = 0; point < points.length; point++) {
            double x =random.nextDouble(10);
            double y =random.nextDouble(10);
            points[point][0] = x;
            points[point][1] = y;
        }
        return points;
    }
    public static double[][] findClosestPoints(double[][] points){
        for (int point = 0; point < points.length; point++) {
            
        }


        Point2D point1 = new Point();
        double[][] treq = new double[2][2];
        return treq;
    }
}
