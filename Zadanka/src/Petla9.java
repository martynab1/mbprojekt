import java.util.Scanner;

public class Petla9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj początkową liczbę organizmów (większą lub równą 2): ");
        int poczatkowaLiczba = scanner.nextInt();

        while (poczatkowaLiczba < 2) {
            System.out.print("Nieprawidłowa wartość. Podaj liczbę większą lub równą 2: ");
            poczatkowaLiczba = scanner.nextInt();
        }

        System.out.print("Podaj średni dzienny przyrost populacji (w procentach): ");
        double sredniPrzyrost = scanner.nextDouble();

        while (sredniPrzyrost < 0) {
            System.out.print("Nieprawidłowa wartość. Podaj wartość większą lub równą 0: ");
            sredniPrzyrost = scanner.nextDouble();
        }

        System.out.print("Podaj liczbę dni, przez jakie organizmy się rozmnażają (większą lub równą 1): ");
        int liczbaDni = scanner.nextInt();

        while (liczbaDni < 1) {
            System.out.print("Nieprawidłowa wartość. Podaj liczbę większą lub równą 1: ");
            liczbaDni = scanner.nextInt();
        }

        double przyrostDzienny = sredniPrzyrost / 100.0;
        double wielkoscPopulacji = poczatkowaLiczba;

        for (int dzien = 1; dzien <= liczbaDni; dzien++) {
            wielkoscPopulacji *= (1 + przyrostDzienny);
            System.out.println("Dzień " + dzien + ": Wielkość populacji = " + wielkoscPopulacji);
        }

        scanner.close();

    }
}
