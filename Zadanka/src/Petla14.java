import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Petla14 {
    public static void main(String[] args) {


        try {

            BufferedReader reader = new BufferedReader(new FileReader("nazwa_pliku.txt"));
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
        }

    }
}
