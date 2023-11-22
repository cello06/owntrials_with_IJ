package my_week_12;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) {
        File file = new File("scores.txt");

        if(file.exists()) {
            System.out.println("File already exist");
            System.exit(1);
        }
        try {
            PrintWriter output = new PrintWriter(file);
            output.print("Celalettin H Akturk ");
            output.println("58");
            output.print("Tarık M Yasar ");
            output.println(100);
            output.close();
        }catch (Exception e) {
            System.out.println("File not found ");
        }
    }
}

