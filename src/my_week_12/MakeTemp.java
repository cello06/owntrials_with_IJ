package my_week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MakeTemp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir")+
                "/src/my_week_12/temp.txt");
        PrintWriter outPut = new PrintWriter(file);
        outPut.print("");
        outPut.close();
    }
}

