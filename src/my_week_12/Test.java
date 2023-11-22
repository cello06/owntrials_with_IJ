package my_week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length > 1) {
            System.out.println("Wrong input! \nUsage : java Test.java fileName");
        }
        String fileName = "C:\\Users\\Celallettin\\workspace\\cello_java\\my_own\\my_own_studies\\src\\my_week_12";

        File file = new File(fileName);

        File[] files = file.listFiles();

        for (File currentFile :files) {
            Scanner input = new Scanner(currentFile);
            String s = "";
            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }
            s = s.replaceAll("\\s*\\{"," {");
            PrintWriter output = new PrintWriter(currentFile);
            output.println(s);
            output.close();
        }

//        try (
   //             Scanner input = new Scanner(file)
//
//        ) {
  //          while (input.hasNext()) {
    //            s += input.nextLine() + "\n";
     //       }
      //      s = s.replaceAll("\\s*\\ {"," {");

          //  PrintWriter output = new PrintWriter(file);
           // output.println(s);
           // output.close();
        //}
    }
}

