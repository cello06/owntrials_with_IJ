//package week_13
package my_week_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_18 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Wrong input !\n" +
                    "Usage : java Question_12_18.java srcRootFile");
            System.exit(1);
        }
        ArrayList<File> directories = new ArrayList<>();
        String path = args[0];
        File file = new File(path);
        if(file.isDirectory()){
            directories.add(file);
        }else {
            System.out.println("It is not a Directory path!\n" +
                    "Please enter a directory path !");
            System.exit(2);
        }

        while (!directories.isEmpty()){
            File firstFile = directories.remove(0);
            File[] files = firstFile.listFiles();

            for (File f : files) {
                if(f.isDirectory()){
                    directories.add(f);
                }else {
                    changeFile(f,firstFile);
                }
            }
        }

    }
    public static void changeFile(File file,File directory){
       StringBuilder page = new StringBuilder("//package " + directory.getName() + "\n");
        try{
           Scanner input = new Scanner(file);
           while(input.hasNext()){
               page.append(input.nextLine()).append("\n");
           }
            PrintWriter output = new PrintWriter(file);
           output.print(page.toString());
           output.close();
       }catch (FileNotFoundException ex){
           System.out.println("File not found!");
       }
    }
}
