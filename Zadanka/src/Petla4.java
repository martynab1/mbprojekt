import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class Petla4 {

        public static void main(String[] args) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("nazwa_pliku.txt"));
                System.out.print("Podaj znak do zliczenia: ");
                char znak = (char) reader.read();

                int licznik = 0;
                int kodZnaku = (int) znak;

                int odczytanyZnak;
                while ((odczytanyZnak = reader.read()) != -1) {
                    if (odczytanyZnak == kodZnaku) {
                        licznik++;
                    }
                }

                System.out.println("Liczba wystąpień znaku '" + znak + "' w pliku: " + licznik);

                reader.close();
            } catch (IOException e) {
                System.err.println("Błąd odczytu pliku.");
            }
        }
    }