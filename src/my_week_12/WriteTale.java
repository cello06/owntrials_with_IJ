package my_week_12;

import java.io.File;
import java.io.PrintWriter;

public class WriteTale {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        File tale = new File(System.getProperty("user.dir") +
                "/src/my_week_12/ATaleOfTwoCities");
        System.out.println(tale.getAbsolutePath());
        PrintWriter output = new PrintWriter(tale);
        output.println("It was the best of times, it was the worst of times,"
                +" it was the age of wisdom");
        output.println("it was the age of foolishness, it was the epoch of belief,"
                +"it was the epoch of incredulity,");
        output.println("it was the season of Light, it was the season of Darkness,");
        output.println("it was the spring of hope, it was the winter of despair,");
        output.println("we had everything before us, we had nothing before us,");
        output.println("we were all going direct to Heaven, we were all going direct the other way");
        output.close();
    }

}

