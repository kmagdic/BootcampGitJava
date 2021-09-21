import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TempCroatiaFileWriter {

    public static void main(String[] args) throws IOException {

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fileName = "temp_croatia_" + formatter.format(new Date()) + ".txt";
        FileWriter w = new FileWriter(fileName);

        String url = "https://meteo.hr/podaci.php?section=podaci_vrijeme&prikaz=abc";
        Document doc = Jsoup.connect(url).get();

        // get all <tr> child elemeents from <table id="table-aktualni-podaci" class="fd-c-table">
        Elements trs = doc.select("#table-aktualni-podaci.fd-c-table1 tr");
        for (Element tr : trs) {
            String city = tr.child(0).text();
            String temp = tr.child(2).text();
            String pressure = tr.child(4).text();

            // remove '*' and '-'
            pressure = pressure.replaceAll("\\*", "");
            pressure = pressure.replaceAll("-", "0");
            temp = temp.replaceAll("-", "0");

            w.write(city + ", " + temp + ", " + pressure + "\n");
        }
        w.close();

        System.out.println("File '" + fileName + "' is created.");
    }
}