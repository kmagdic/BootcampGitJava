package temperature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TempCroatiaFileProcessor {

    public static void main(String[] args) throws FileNotFoundException {
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

        while(s.hasNext()) {
            String city = s.next();
            float temp = s.nextFloat();
            float pressure = s.nextFloat();
            System.out.println(city + " - " + temp + " - " + pressure);
        }

    }

    // Tim 1
    private static String printCityWithMaxTemp(String fileName) throws FileNotFoundException {

        return "";
    }

    // Tim 2
    private static void printCityWithMinTemp(String fileName)  {

    }

    // Tim 3
    private static void printAverageTemp(String fileName) {

    }

    // Tim 4
    private static int getCountOfCites(String fileName) {
        return 0;
    }
}
