import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) {

        try {
            FileWriter w = new FileWriter("temp_croatia_demo.txt");

            w.write("Postaja, Temperatura zraka (°C), Tlak zraka (hPa)");
            w.write("Zagreb, 21.5, 1005\n");
            w.write("Sisak, 23, 1009\n");
            w.write("Bjelovar, 25, 1007\n");

            w.close();
            System.out.println("File is created.");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
