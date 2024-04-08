import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Petla13 {
    public static void main(String[] args) {

        BufferedReader reader = null;
        try {

            System.out.print("Podaj nazwę pliku: ");
            String nazwaPliku = System.console().readLine();



            reader = new BufferedReader(new FileReader(nazwaPliku));

            String line;
            int licznikWierszy = 0;

            while ((line = reader.readLine()) != null && licznikWierszy < 5) {
                System.out.println(line);
                licznikWierszy++;
            }


            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Błąd zamykania pliku: " + e.getMessage());
            }
        }
    }
    }

