package my_week_05;

import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String yourStr = input.nextLine();
        int countOfWord = 1;
        for (int i = 0; i < yourStr.length()-1; i++) {
            if(yourStr.charAt(i)==' '&&yourStr.charAt(i+1)==' '){
                continue;
            } else if (yourStr.charAt(i)==' ') {
                countOfWord++;
            }else {

            }
        }
        System.out.println(countOfWord);
    }
}
