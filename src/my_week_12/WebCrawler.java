package my_week_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL :");
        String URL = input.next();
        crawler(URL);
    }

    public static void crawler(String URLstring) {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();

        pendingURLs.add(URLstring);
        while (!pendingURLs.isEmpty() &&
                traversedURLs.size() <= 100) {
            String startUrl = pendingURLs.remove(0);
            if (!traversedURLs.contains(startUrl)) {
                traversedURLs.add(startUrl);
                System.out.println("Craw " + startUrl);
                for (String s : getSubURLs(startUrl)) {
                    if (!traversedURLs.contains(s)) {
                        pendingURLs.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String startUrl) {
        ArrayList<String> list = new ArrayList<>();
        try {
            URL url = new URL(startUrl);

            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();

                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }

            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL!");
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        return list;
    }
}

