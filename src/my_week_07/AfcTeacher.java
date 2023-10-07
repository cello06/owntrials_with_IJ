package my_week_07;

import java.util.Scanner;

public class AfcTeacher {
    public static void main(String[] args) {
        int[] list = getList();
        boolean isEqual = checkEquality(list);
        System.out.println(isEqual);
    }
    public static int[] getList(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an array : ");
        int sizeOfArray = input.nextInt();
        int[] list = new int[sizeOfArray];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
    public static boolean checkEquality(int[] list){
        int rightSide = 0;
        int leftSide = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(j < i){
                    leftSide += list[j];
                }else {
                    rightSide += list[j];
                }
            }
            if(rightSide == leftSide){
                return true;
            }else {
                leftSide = 0;
                rightSide = 0;
            }
        }
        return false;
    }
}
