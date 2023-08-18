package my_week_03;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double taxAmount = 0;
        System.out.print("O = single filers\n" + "1 = married filing jointly or qualified widow(er)\n"
                + "2 = married filing separately\n" + "3 =  head of household\n" + "\n\nEnter your Filing Status :");
        int filingStatus = input.nextInt();
        System.out.print("Now enter taxable income :");
        double taxableIncome = input.nextDouble();
        switch (filingStatus) {
            case 0:
                if (taxableIncome >= 372_951) {
                    taxAmount = (8_350 / 10) + ((33_950.0 - 8_351.0) * 15 / 100) + ((82_250.0 - 33_951.0) * 25 / 100) +
                            ((171_550.0 - 82_251.0) * 28 / 100) + ((372_950.0 - 171_551.0) * 33 / 100) +
                            ((taxableIncome - 372_951.0) * 35 / 100);
                } else if (taxableIncome >= 171_551) {
                    taxAmount = (8_350 / 10) + ((33_950.0 - 8_351.0) * 15 / 100) + ((82_250.0 - 33_951.0) * 25 / 100) +
                            ((171_550.0 - 82_251.0) * 28 / 100) + ((taxableIncome - 171_551.0) * 33 / 100);
                } else if (taxableIncome >= 82_251) {
                    taxAmount = (8_350 / 10) + ((33_950.0 - 8_351.0) * 15 / 100) +
                            ((taxableIncome - 82_251.0) * 28 / 100);
                } else if (taxableIncome >= 33_951) {
                    taxAmount = (8_350 / 10) + ((taxableIncome - 33_951.0) * 25 / 100);
                } else {
                    taxAmount = taxableIncome / 10.0;
                }
                break;
            case 1:
                if (taxableIncome >= 372_951) {
                    taxAmount = (16_700.0 / 10) + ((67_900.0 - 16_701.0) * 15 / 100) +
                            ((137_050.0 - 67_901.0) * 25 / 100) + ((208_850.0 - 137_051.0) * 28 / 100) +
                            ((372_950.0 - 208_851.0) * 33 / 100) + ((taxableIncome - 372_951.0) * 35 / 100);
                } else if (taxableIncome >= 208_851) {
                    taxAmount = (16_700.0 / 10) + ((67_900.0 - 16_701.0) * 15 / 100) +
                            ((137_050.0 - 67_901.0) * 25 / 100) + ((208_850.0 - 137_051.0) * 28 / 100) +
                            ((taxableIncome - 208_851.0) * 33 / 100);
                } else if (taxableIncome >= 137_051) {
                    taxAmount = (16_700.0 / 10) + ((67_900.0 - 16_701.0) * 15 / 100) +
                            ((137_050.0 - 67_901.0) * 25 / 100) + ((taxableIncome - 137_051.0) * 28 / 100);
                } else if (taxableIncome >= 67_901) {
                    taxAmount = (16_700.0 / 10) + ((67_900.0 - 16_701.0) * 15 / 100) +
                            ((taxableIncome - 67_901.0) * 25 / 100);
                } else if (taxableIncome >= 16_701) {
                    taxAmount = (16_700.0 / 10) + ((taxableIncome - 16_701.0) * 15 / 100);
                } else {
                    taxAmount = taxableIncome / 10;
                }
                break;
            case 2:
                if (taxableIncome >= 186_476) {
                    taxAmount = (8_350.0 / 10) + ((33_950.0 - 8_351.0) * 15 / 100) +
                            ((68_525.0 - 33_951) * 25 / 100) + ((104_425.0 - 68_526.0) * 28 / 100) +
                            ((186_475.0 - 104_426.0) * 33 / 100) + ((taxableIncome - 186_476.0) * 35 / 100);
                } else if (taxableIncome >= 104_426) {
                    taxAmount = (8_350.0 / 10) + ((33_950.0 - 8_350.0) * 15 / 100) +
                            ((68_525.0 - 33_951) * 25 / 100) + ((104_425.0 - 68_526.0) * 28 / 100) +
                            ((taxableIncome - 104_426.0) * 33 / 100);
                } else if (taxableIncome >= 68_526) {
                    taxAmount = (8_350.0 / 10) + ((33_950.0 - 8_350.0) * 15 / 100) +
                            ((68_525.0 - 33_951) * 25 / 100) + ((taxableIncome - 68_526.0) * 28 / 100);
                } else if (taxableIncome >= 33_951) {
                    taxAmount = (8_350.0 / 10) + ((33_950.0 - 8_350.0) * 15 / 100) +
                            ((taxableIncome - 33_951) * 25 / 100);
                } else if (taxableIncome >= 8_351) {
                    taxAmount = (8_350.0 / 10) + ((taxableIncome - 8_350.0) * 15 / 100);
                } else {
                    taxAmount = taxableIncome / 10;
                }
                break;
            case 3:
                if (taxableIncome >= 372_951) {
                    taxAmount = (11_950.0 / 10) + ((45_500.0 - 11_951.0) * 15 / 100) +
                            ((117_450.0 - 45_501.0) * 25 / 100) + ((190_200.0 - 117_451.0) * 28 / 100) +
                            ((372_950.0 - 190_201.0) * 33 / 100) + ((taxableIncome - 372_951.0) * 35 / 100);
                } else if (taxableIncome >= 190_201) {
                    taxAmount = (11_950.0 / 10) + ((45_500.0 - 11_951.0) * 15 / 100) +
                            ((117_450.0 - 45_501.0) * 25 / 100) + ((190_200.0 - 117_451.0) * 28 / 100) +
                            ((taxableIncome - 190_201.0) * 33 / 100);
                } else if (taxableIncome >= 117_451) {
                    taxAmount = (11_950.0 / 10) + ((45_500.0 - 11_951.0) * 15 / 100) +
                            ((117_450.0 - 45_501.0) * 25 / 100) + ((taxableIncome - 117_451.0) * 28 / 100);
                } else if (taxableIncome >= 45_501) {
                    taxAmount = (11_950.0 / 10) + ((45_500.0 - 11_951.0) * 15 / 100) +
                            ((taxableIncome - 45_501.0) * 25 / 100);
                } else if (taxableIncome >= 11_951) {
                    taxAmount = (11_950.0 / 10) + ((taxableIncome - 11_951.0) * 15 / 100);
                } else {
                    taxAmount = taxableIncome / 10;
                }
                break;

        }
        System.out.println("The tax amount that you need to pay is " + (int) (taxAmount * 100) / 100.0);
    }
}
