package my_week_06;

import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        String number1 = input.nextLine();
        System.out.print("Enter second number : ");
        String number2 = input.nextLine();

        //After laearning that the number contains ',' I will calculate
        //fractional part and whole part differently in stringCalculator() method
        // and then combine them to make newNumber which is th result of calculation..

        String fractionalPartOfNumber1 = "";
        String fractionalPartOfNumber2 = "";
        String wholePartOfNumber1 = "";
        String wholePartOfNumber2 = "";

        String sumOfFractionalParts = "";
        String sumOfWholeParts = "";
        String newNumber = "";

        int decimalIndexOfNumber1;// it shows the index of ',' in number1 (if there is)
        int decimalIndexOfNumber2;// it shows the index of ',' in number2 (if there is)

        if (number1.contains(",") && number2.contains(",")) {//if both contains ','...
            decimalIndexOfNumber1 = number1.indexOf(",");
            decimalIndexOfNumber2 = number2.indexOf(",");

            fractionalPartOfNumber1 = number1.substring((decimalIndexOfNumber1 + 1));
            fractionalPartOfNumber2 = number2.substring((decimalIndexOfNumber2 + 1));
            wholePartOfNumber1 = number1.substring(0, decimalIndexOfNumber1);
            wholePartOfNumber2 = number2.substring(0, decimalIndexOfNumber2);

            sumOfFractionalParts = stringCalculator(fractionalPartOfNumber1, fractionalPartOfNumber2);
            sumOfWholeParts = stringCalculator(wholePartOfNumber1, wholePartOfNumber2);

            int lengthOfSumOfFractionalPrats = sumOfFractionalParts.length();
            int lengthOfFractionalPartOfNumber1 = fractionalPartOfNumber1.length();
            int lengthOfFractionalPartOfNumber2 = fractionalPartOfNumber2.length();

            if (lengthOfSumOfFractionalPrats > Math.max(lengthOfFractionalPartOfNumber1, lengthOfFractionalPartOfNumber2)) {
                sumOfFractionalParts = sumOfFractionalParts.substring(1);
                sumOfWholeParts = stringCalculator(sumOfWholeParts, "1");
            }


        } else if (number1.contains(",")) {//if only number1 contains ','...
            decimalIndexOfNumber1 = number1.indexOf(",");

            fractionalPartOfNumber1 = number1.substring((decimalIndexOfNumber1 + 1));
            fractionalPartOfNumber2 = "0";
            wholePartOfNumber1 = number1.substring(0, decimalIndexOfNumber1);
            wholePartOfNumber2 = number2;

            sumOfFractionalParts = stringCalculator(fractionalPartOfNumber1, "0");
            sumOfWholeParts = stringCalculator(wholePartOfNumber1, wholePartOfNumber2);

        } else if (number2.contains(",")) {//if only number2 contains ','...
            decimalIndexOfNumber2 = number2.indexOf(",");

            fractionalPartOfNumber1 = "0";
            fractionalPartOfNumber2 = number2.substring((decimalIndexOfNumber2 + 1));
            wholePartOfNumber1 = number1;
            wholePartOfNumber2 = number2.substring(0, decimalIndexOfNumber2);

            sumOfFractionalParts = stringCalculator("0", fractionalPartOfNumber2);
            sumOfWholeParts = stringCalculator(wholePartOfNumber1, wholePartOfNumber2);


        } else {//if two numbers has no ',' in them ...
            wholePartOfNumber1 = number1;
            wholePartOfNumber2 = number2;

            sumOfFractionalParts = "0";
            sumOfWholeParts = stringCalculator(wholePartOfNumber1, wholePartOfNumber2);
        }

        newNumber = sumOfWholeParts + "," + sumOfFractionalParts;
        System.out.printf("The sum of %s and  %s  \n ---->  : %s", number1, number2, newNumber);

    }

    public static String stringCalculator(String num1, String num2) {

        int lengthOfNum1 = num1.length();
        int lengthOfNum2 = num2.length();

        //if their length are not equal I want to make them equal
        //by adding '0' which has no value in sum, to the low digit number.

        if (lengthOfNum1 != lengthOfNum2) {
            if (lengthOfNum2 > lengthOfNum1) {
                String temp = num1;
                num1 = num2;
                num2 = temp;
            }
            lengthOfNum1 = num1.length();//uptimize their length
            lengthOfNum2 = num2.length();//uptimize their length

            int zeroToAdd = lengthOfNum1 - lengthOfNum2;

            for (int i = 0; i < zeroToAdd; i++) {//adding zero to little number for sum calculation
                num2 = "0".concat(num2);
            }
            lengthOfNum1 = num1.length();//uptimize their length
            lengthOfNum2 = num2.length();//uptimize their length
        }
        int countIndexOfNum2 = lengthOfNum2 - 1;//I will use it for number2's index number

        String sum = "";
        int oneDigitOfNum2;
        int oneDigitOfNum1;
        //if calculation of two digits surpass 10 I need
        // this value(artanOndalık) to add next digit calculation
        int artanOndalık = 0;//for now it is zero.

        for (int i = lengthOfNum1 - 1; i >= 0; i--) {

            if (num1.charAt(i) == '0') {
                oneDigitOfNum1 = 0 + artanOndalık;
            } else {
                oneDigitOfNum1 = (num1.charAt(i) - '0') + artanOndalık;
            }

            if (num2.charAt(countIndexOfNum2) == '0') {
                oneDigitOfNum2 = 0;
            } else {
                oneDigitOfNum2 = (num2.charAt(countIndexOfNum2) - '0');
            }

            int sumForOneDigit = oneDigitOfNum1 + oneDigitOfNum2;

            if (sumForOneDigit >= 10) {
                sumForOneDigit = sumForOneDigit % 10;
                artanOndalık = 1;
            } else {
                artanOndalık = 0;
            }

            sum = sumForOneDigit + sum;
            countIndexOfNum2--;
        }
        if (artanOndalık == 1) {
            sum = "1" + sum;
        }
        return sum;
    }
}
