package my_week_07;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        double sumOfNumbers = sum(1, 2.5,5,5, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfNumbers);
    }

    public static double sum(double...numbers){
        double sumOfNumbers = 0;
        for(double number : numbers){
            sumOfNumbers += number;
        }
        return sumOfNumbers;
    }

}
