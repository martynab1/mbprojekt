import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę (od 1 do 10): ");
        int liczba = scanner.nextInt();

        String[] rzymskie = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        if (liczba >= 1 && liczba <= 10) {
            System.out.println("Liczba rzymska dla " + liczba + " to: " + rzymskie[liczba - 1]);
        } else {
            System.out.println("Podana liczba nie mieści się w przedziale od 1 do 10.");
        }
    }
}

