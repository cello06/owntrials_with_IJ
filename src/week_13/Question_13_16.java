package week_13;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first rational number : ");
        String firstRationalNumber = input.next();
        System.out.println("Enter numerator for calculation :  ");
        String numerator = input.next();
        System.out.println("Enter second rational number : ");
        String secondRationalNumber = input.next();
        try {


            FixedRational first = rationalCreator(firstRationalNumber);
            FixedRational second = rationalCreator(secondRationalNumber);
            calculate(first, second, numerator);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static FixedRational rationalCreator(String rational) {
        FixedRational number = new FixedRational();
        try {
            if (rational.contains("/")) {

                String[] numbers = rational.split("/");
                if (numbers.length != 2) {
                    System.out.println("wrong input for rational number!");
                    throw new RuntimeException("wrong input for rational number!");
                }
                BigInteger numerator = new BigInteger(numbers[0]);
                BigInteger denominator = new BigInteger(numbers[1]);
                number.setNumerator(numerator);
                number.setDenominator(denominator);
            } else {
                BigInteger numerator = new BigInteger(rational);
                number.setNumerator(numerator);
            }

        } catch (NumberFormatException e) {
            System.out.println("Some problem occurred while creating BigInteger!!");
        }
        return number;
    }

    public static void calculate
            (FixedRational number1, FixedRational number2, String numerator) {
        String result = "";
        switch (numerator) {
            case "+":
                result = number1.add(number2).toString();
                break;
            case "-":
                result = number1.subtract(number2).toString();
                break;
            case "*":
                result = number1.multiply(number2).toString();
                break;
            case "/":
                result = number1.divide(number2).toString();
                break;
            default:
                throw new RuntimeException("Wrong numerator for calculation !");
        }
        System.out.println(number1 + " " + numerator + " " + number2 + " = " + result);
    }
}

