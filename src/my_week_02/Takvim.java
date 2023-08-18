package my_week_02;

import java.util.Calendar;
import java.util.Scanner;

public class Takvim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you please enter the date that you want to find " +
                "the name of its day" + "\nYear :");
        int year = input.nextInt();
        System.out.print("Month :");
        int month = input.nextInt();
        System.out.print("Day :");
        int day = input.nextInt();

        String gün = findDay(year, month, day);
        System.out.println(gün);
    }

    public static String findDay(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return daysOfWeek[dayOfWeek - 1];


    }

}
