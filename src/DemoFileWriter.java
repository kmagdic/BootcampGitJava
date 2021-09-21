import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args) {

        try {
            FileWriter w = new FileWriter("temp_croatia_demo.txt");

            w.write("Zagreb, 21.5, 1005\n");
            w.write("Sisak, 23, 1005\n");
            w.write("Bjelovar, 25, 1005\n");

            w.close();
            System.out.println("File is created.");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
