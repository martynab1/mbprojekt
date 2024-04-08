import java.io.PrintWriter;
import java.util.Scanner;

public class Petla2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szybkość pojazdu (w km/h): ");
        double szybkosc = scanner.nextDouble();
        System.out.print("Podaj liczbę godzin podróży: ");
        int liczbaGodzin = scanner.nextInt();
        scanner.close();

        System.out.println("Godzina\tPrzebyta odległość");
        for (int godzina = 1; godzina <= liczbaGodzin; godzina++) {
            double odleglosc = szybkosc * godzina;

            System.out.println(godzina + "\t" + odleglosc);

        }

    }
}
