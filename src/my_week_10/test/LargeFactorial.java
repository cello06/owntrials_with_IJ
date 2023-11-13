package my_week_10.test;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }

    public static String factorial(int size) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= size; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result.toString();
    }
}
