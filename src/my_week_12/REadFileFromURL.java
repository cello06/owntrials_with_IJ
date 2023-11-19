package my_week_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class REadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL :");
        String URLstring = new Scanner(System.in).next();
        try {
            URL url = new URL(URLstring);
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}

