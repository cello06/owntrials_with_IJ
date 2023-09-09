package my_week_05;

public class FizzBuzz {
    public static void main(String[] args) {
        String result = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 != 0) {

                result += "Fizz\n";

            } else if (i % 5 == 0 && i % 3 != 0) {

                result += "Buzz\n";

            } else if (i % 3 == 0 && i % 5 == 0) {

                result += "FizzBuzz\n";

            } else {

                result += i + "\n";
            }
        }
        System.out.println(result);
    }
}
