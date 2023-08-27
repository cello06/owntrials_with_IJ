package my_week_04;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Please enter a string :");

        String name= input.nextLine();

        System.out.println("You have entered :"+name);

        System.out.print("The firs character is :");

        name=name.trim();

        System.out.print(name.charAt(0));


        int lastDigit = name.length();

        System.out.printf("\nThe last chararter of %s is %c ",name,name.charAt(lastDigit-1));

    }
}
