package my_week_10.test;

import my_week_10.classes.Loan;

import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25 :");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer :");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 12000.95 : ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + loan.getLoanDate().toString());
        System.out.printf("The monthly payment : %.2f\n", loan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f", loan.getTotalPayment());
    }
}
