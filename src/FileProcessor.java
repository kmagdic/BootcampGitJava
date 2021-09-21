import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("temp_croatia.txt"));

        // skip first line (header)
        s.nextLine();

        // set delimiter to ", " or "\n"
        s.useDelimiter(", |\n");

        while(s.hasNext()) {
            String city = s.next();
            float temp = s.nextFloat();
            float pressure = s.nextFloat();
            System.out.println(city + " - " + temp + " - " + pressure);

        }
    }


}