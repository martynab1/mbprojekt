import java.util.Scanner;

public class Petla8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę lat: ");
        int liczbaLat = scanner.nextInt();

        if (liczbaLat < 1) {
            System.out.println("Liczba lat musi być większa lub równa 1.");
            return;
        }

        double sumaOpadow = 0;
        int liczbaMiesiecy = liczbaLat * 12;

        for (int rok = 1; rok <= liczbaLat; rok++) {
            for (int miesiac = 1; miesiac <= 12; miesiac++) {
                System.out.print("Podaj ilość opadów w centymetrach dla miesiąca " + miesiac + " roku " + rok + ": ");
                double opady = scanner.nextDouble();

                if (opady < 0) {
                    System.out.println("Opady nie mogą być ujemne.");
                    return;
                }

                sumaOpadow += opady;
            }
        }

        double sredniPoziomOpadow = sumaOpadow / liczbaMiesiecy;

        System.out.println("Liczba lat: " + liczbaLat);
        System.out.println("Liczba miesięcy: " + liczbaMiesiecy);
        System.out.println("Łączna ilość opadów: " + sumaOpadow + " cm");
        System.out.println("Średni poziom opadów: " + sredniPoziomOpadow + " cm/miesiąc");
    }
}
