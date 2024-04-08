import java.util.Scanner;

public class Petla3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę przepracowanych dni: ");
        int liczbaDni = scanner.nextInt();
        scanner.close();

        int zarobek = 0;
        int sumaZarobku = 0;

        System.out.println("Dzień\tZarobek (w złotych)");

        for (int dzien = 1; dzien <= liczbaDni; dzien++) {
            zarobek = dzien;
            sumaZarobku += zarobek;
            System.out.println(dzien + "\t" + (zarobek / 100.0));
        }

        System.out.println("\nSumaryczna zapłata za " + liczbaDni + " dni: " + (sumaZarobku / 100.0) + " zł");
    }
}
