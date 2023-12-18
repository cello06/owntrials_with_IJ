//package week_13
package my_week_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_12 {

    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 1){
            System.out.println("Wrong input! \n " +
                    "Usage : java Question_12_12.java fileName");
            System.exit(1);
        }
        String pathFile = args[0];
        File file = new File(pathFile);

        Scanner input = new Scanner(file);
        String page = "";
        while (input.hasNext()){
            page += input.nextLine() + "\n";
        }
        page = page.replaceAll("\\s*\\{"," {");
        PrintWriter output = new PrintWriter(file);
        output.print(page);
        output.close();

    }
}
