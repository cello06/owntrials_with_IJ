package my_week_14;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(GregorianCalendar.YEAR);
        System.out.println(currentYear);
        Date currentDateReal = new Date();
        System.out.println(currentDateReal);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your birthday");
                System.out.print("Enter year (****):");
                int year = input.nextInt();
                if (year > currentYear || year <= 0) {
                    throw new InputMismatchException("Wrong year!");
                }
                System.out.print("Enter month (**): ");
                int month = input.nextInt();
                if (month > 12 || month <= 0) {
                    throw new InputMismatchException("Wrong month!");
                }
                System.out.print("Enter day (**): ");
                int day = input.nextInt();
                if (day <= 0 || day > 31) {
                    throw new InputMismatchException("Wrong Day");
                }
                int age = findAge(year, month, day);
                //String zodiacSign = findZodiacSign(month, day);
                System.out.println("You age is : " + age);
                //System.out.println("You zodiac sign is : " + zodiacSign);
                //printSomeFeatures(zodiacSign);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                System.out.println(e.getMessage());
            }
            input.nextLine();
        }
    }

    public static int findAge(int year, int month, int day) {
        String currentDate = findCurrentDate();   //   day/month/year
        String[] parts = currentDate.split("/");
        int currentYear = Integer.parseInt(parts[2]);
        int currentMonth = Integer.parseInt(parts[1]);
        int currentDay = Integer.parseInt(parts[0]);
        int age = 0;
        if (currentMonth >= month) {
            if (currentDay >= day) {
                age = currentYear - year;
            } else {
                age = currentYear - year - 1;
            }
        } else {
            age = year - currentYear - 1;
        }
        return age;
    }

    public static String findCurrentDate() {

        long totalSeconds = System.currentTimeMillis() / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;
        int currentHour = (int) (totalHours % 24);
        if (currentHour > 0) {
            totalDays--;
        }
        int currentYear = 1970;
        int currentMonth = 1;
        int currentDay = 1;
        while (totalDays >= dayOfCurrentYear(currentYear)) {
            totalDays -= dayOfCurrentYear(currentYear);
            currentYear++;
        }
        while (totalDays >= dayOfCurrentMonth(currentMonth, currentYear)) {
            totalDays -= dayOfCurrentMonth(currentMonth, currentYear);
            currentMonth++;
            if (totalDays <= dayOfCurrentMonth(currentMonth, currentYear)) {
                currentMonth++;
            }
        }
        currentDay = (int) (totalDays);
        System.out.println("Current hour is : " + currentHour);
        System.out.println("Current Date : " + currentDay + "/" + currentMonth + "/" + currentYear);
        return currentDay + "/" + currentMonth + "/" + currentYear;
    }

    public static int dayOfCurrentYear(int currentYear) {
        return isLeapYear(currentYear) ? 365 : 366;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int dayOfCurrentMonth(int month, int currentYear) {
        if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return isLeapYear(currentYear) ? 28 : 29;
        } else {
            return 30;
        }
    }

}
