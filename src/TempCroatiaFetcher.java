import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class TempCroatiaFetcher {

    public static void main(String[] args) throws IOException{
        FileWriter w = new FileWriter("temp_croatia.txt");

        String url = "https://meteo.hr/podaci.php?section=podaci_vrijeme&prikaz=abc";
        Document doc = Jsoup.connect(url).get();

        // get all <tr> child elemeents from <table id="table-aktualni-podaci" class="fd-c-table">
        Elements trs = doc.select("#table-aktualni-podaci.fd-c-table1 tr");
        for (Element tr : trs) {
            String city = tr.child(0).text();
            String temp = tr.child(2).text();
            String pressure = tr.child(4).text();
            pressure = pressure.replaceAll("\\*", "");

            temp = temp.replaceAll("-", "0");
            pressure = pressure.replaceAll("-", "0");

            w.write(city + ", " + temp + ", " + pressure + "\n");
        }
        w.close();
    }
}