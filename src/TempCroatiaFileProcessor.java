import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TempCroatiaFileProcessor {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("temp_croatia_2021-09-21.txt"));

        // set delimiter to ", " or "\n" (instead of default " ")
        s.useDelimiter(", |\n");

        // skip first line (header)
        s.nextLine();

        while(s.hasNext()) {
            String city = s.next();
            float temp = s.nextFloat();
            float pressure = s.nextFloat();
            System.out.println(city + " - " + temp + " - " + pressure);
        }


    }


}
