package my_week_08;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        printOneMouthWeatherReport();
    }

    public static void printOneMouthWeatherReport() {
        double[][][] report = getReport();
        double[][] averageReport = average(report);
        printReport(averageReport);
        evaluateReport(averageReport);
    }

    public static double[][][] getReport() {
        final int NUMBER_OF_HOURS = 24;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year :");
        int year = input.nextInt();
        System.out.print("Enter month : ");
        int month = input.nextInt();

        int countOfDay = daysInMonth(year, month);

        double[][][] report = new double[countOfDay][NUMBER_OF_HOURS][2];

        for (int day = 0; day < report.length; day++) {
            for (int hour = 0; hour < report[day].length; hour++) {
                report[day][hour][0] = Math.random() * 100;
                report[day][hour][1] = Math.random();
            }
        }
        return report;
    }

    public static int daysInMonth(int year, int mouth) {
        if (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 ||
                mouth == 8 || mouth == 10 || mouth == 12) {
            return 31;
        } else if (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11) {
            return 30;
        } else {
            return isLeapYear(year) ? 29 : 28;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static double[][] average(double[][][] report) {
        double[][] averageReport = new double[report.length][2];

        for (int day = 0; day < report.length; day++) {
            double sumOfTemperatures = 0;
            double sumOfHumidity = 0;
            for (int hour = 0; hour < report[day].length; hour++) {
                for (int i = 0; i < 2; i++) {
                    sumOfTemperatures += report[day][hour][0];
                    sumOfHumidity += report[day][hour][1];
                }
            }
            averageReport[day][0] = sumOfTemperatures / report.length;
            averageReport[day][1] = sumOfHumidity / report.length;
        }
        return averageReport;
    }

    public static void printReport(double[][] averageReport) {
        for (int day = 0; day < averageReport.length; day++) {
            System.out.printf("Average Temperature in Day %d is : %.1f\n",day+1,averageReport[day][0]);
            System.out.printf("Average Humidity in Day %d is : %.2f\n",day+1,averageReport[day][1]);
        }
    }

    public static void evaluateReport(double[][] averageReport) {
        for (int day = 0; day < averageReport.length; day++) {
            if (averageReport[day][0] > 80.0 && averageReport[day][1] > 0.70) {
                System.out.println("Day " + (day + 1) + "'s weather is very hot and humid be careful !");
            } else if (averageReport[day][0] > 80.0) {
                System.out.println("Day " + (day + 1) + "'s weather is very hot be careful !");
            } else if (averageReport[day][1] > 0.70) {
                System.out.println("Day " + (day + 1) + "'weather is very humid be careful !");
            } else if (averageReport[day][0] < 30) {
                System.out.println("Day " + (day + 1) + "' weather is very cold be careful !");
            } else {
                System.out.println("Day " + (day + 1) + "'s weather is very good !!!");
            }
        }
    }
}
