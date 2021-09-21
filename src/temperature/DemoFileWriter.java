package temperature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileWriter {
    public static void main(String[] args) {

        // get info about file
        File fileA = new File("doc/a.txt");
        System.out.println("Full path of file: " + fileA.getAbsolutePath());
        System.out.println("File size: " + fileA.length());
        System.out.println("File writable: " + fileA.canWrite());


        // write temperature date into file
        try {
            FileWriter w = new FileWriter("temp_croatia_demo.txt");

            w.write("Postaja, Temperatura zraka (°C), Tlak zraka (hPa)\n");

            w.write("Zagreb, 21.5, 1005\n");
            w.write("Sisak, 23.1, 1009\n");
            w.write("Bjelovar, 25.2, 1007\n");

            w.close();
            System.out.println("File is created.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // read same file and print line by line
        try {
            Scanner s = new Scanner(new File("temp_croatia_demo.txt"));

            int i = 0;
            while(s.hasNextLine()) {
                System.out.println("Linija " + i + ": " + s.nextLine());
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}


























/*

        try {
            FileWriter w = new FileWriter("temp_croatia_demo.txt");

            w.write("Postaja, Temperatura zraka (°C), Tlak zraka (hPa)");
            w.write("Zagreb, 21.5, 1005\n");
            w.write("Sisak, 23.1, 1009\n");
            w.write("Bjelovar, 25.2, 1007\n");

            w.close();
            System.out.println("File is created.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        */

