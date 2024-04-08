import java.util.Scanner;

public class Petla7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę pięter w hotelu: ");
        int liczbaPieter = scanner.nextInt();

        if (liczbaPieter < 1) {
            System.out.println("Liczba pięter musi być większa lub równa 1.");
            return;
        }

        int lacznaLiczbaPokoi = 0;
        int lacznaLiczbaZajetychPokoi = 0;

        for (int pietro = 1; pietro <= liczbaPieter; pietro++) {
            System.out.print("Podaj liczbę wszystkich pokoi na " + pietro + " piętrze: ");
            int wszystkiePokoje = scanner.nextInt();

            if (wszystkiePokoje < 10) {
                System.out.println("Liczba pokoi na piętrze musi być większa lub równa 10.");
                return;
            }

            System.out.print("Podaj liczbę zajętych pokoi na " + pietro + " piętrze: ");
            int zajetePokoje = scanner.nextInt();

            lacznaLiczbaPokoi += wszystkiePokoje;
            lacznaLiczbaZajetychPokoi += zajetePokoje;
        }

        int liczbaPustychPokoi = lacznaLiczbaPokoi - lacznaLiczbaZajetychPokoi;
        double poziomOblozenia = (double) lacznaLiczbaZajetychPokoi / lacznaLiczbaPokoi * 100;

        System.out.println("Liczba wszystkich pokoi w hotelu: " + lacznaLiczbaPokoi);
        System.out.println("Liczba zajętych pokoi: " + lacznaLiczbaZajetychPokoi);
        System.out.println("Liczba pustych pokoi: " + liczbaPustychPokoi);
        System.out.printf("Poziom obłożenia: %.2f%%\n", poziomOblozenia);

    }
}
