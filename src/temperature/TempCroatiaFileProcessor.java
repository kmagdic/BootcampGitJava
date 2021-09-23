package temperature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TempCroatiaFileProcessor {

    public static void main(String[] args) throws IOException {
        String fileName = "temp_croatia_2021-09-21.txt";

        printAllCityData(fileName);

        printCityWithMaxTemp(fileName);

        printCityWithMinTemp(fileName);

        printAverageTemp(fileName);

        int count = getCountOfCites(fileName);
        System.out.println("Broj gradova: " + count);

    }


    public static void printAllCityData(String fileName) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fileName));

        // set delimiter to ", " or "\n" (instead of default " ")
        s.useDelimiter(", |\n");

        // skip first line (header)
        s.nextLine();

        while (s.hasNext()) {
            String city = s.next();
            float temp = Float.parseFloat(s.next());
            float pressure = Float.parseFloat(s.next());
            System.out.println(city + " - " + temp + " - " + pressure);
        }

    }

    // Tim 1
    private static void printCityWithMaxTemp(String fileName) throws FileNotFoundException {

        Scanner s = new Scanner(new File(fileName));

        // set delimiter to ", " or "\n" (instead of default " ")
        s.useDelimiter(", |\n");

        // skip first line (header)
        s.nextLine();

        String maxTempCity = "";
        float maxTemp = 0;
        float maxTempCityPressure = 0;

        String city = "";
        float temp = 0;
        float pressure = 0;

        while (s.hasNext()) {

            city = s.next();
            temp = Float.parseFloat(s.next());
            pressure = Float.parseFloat(s.next());

            if (temp > maxTemp) {
                maxTempCity = city;
                maxTemp = temp;
                maxTempCityPressure = pressure;
            }
        }

        System.out.println("Warmest city: " + maxTempCity + " " + maxTemp + "°C Pressure: " + maxTempCityPressure);

    }

    // Tim 2
    private static void printCityWithMinTemp(String fileName) throws IOException {
        Scanner s = new Scanner(new File(fileName));

        // set delimiter to ", " or "\n" (instead of default " ")
        s.useDelimiter(", |\n");

        // skip first line (header)
        s.nextLine();

        String minCity = "";
        float minTemp = 100;

        while (s.hasNext()) {
            String cityName = s.next();
            float temp = Float.parseFloat(s.next());

            if (temp < minTemp) {
                minCity = cityName;
                minTemp = temp;
            }
            // skip pressure
            s.next();
        }
        System.out.println("Grad sa najmanjom temperaturom je: " + minCity + " (" + minTemp + ")");

    }


    // Tim 3
    private static void printAverageTemp(String fileName) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fileName));

        // set delimiter to ", " or "\n" (instead of default " ")
        s.useDelimiter(", |\n");

        // skip first line (header)
        s.nextLine();
        int i = 0;
        float temp2 = 0;
        while (s.hasNext()) {
            String city = s.next();
            float temp = Float.parseFloat(s.next());
            temp2 += temp;
            i++;
            float pressure = Float.parseFloat(s.next());
        }
        temp2 = temp2 / i;
        System.out.println("Prosječna temperatura: " + temp2);
    }

    // Tim 4
    private static int getCountOfCites(String fileName) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fileName));
        // skip first line (header)
        s.nextLine();
        int count = 0;
        while (s.hasNextLine()) {
            s.nextLine();
            count++;

        }
        return count;
    }
}