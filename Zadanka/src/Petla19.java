import java.util.Random;
import java.util.Scanner;
public class Petla19 {
    public static void main(String[] args) {

        String[] colors = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        int correctGuesses = 0;
        int totalRounds = 10;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze zgadywania kolorów!");
        System.out.println("Komputer wybierze losowy kolor, a Ty spróbujesz go odgadnąć.");

        for (int round = 1; round <= totalRounds; round++) {
            int randomIndex = random.nextInt(colors.length);
            String computerColor = colors[randomIndex];

            System.out.println("\nRunda " + round);
            System.out.println("Komputer wybrał kolor. Podaj swoją odpowiedź:");

            String userGuess = scanner.nextLine();

            if (userGuess.equalsIgnoreCase(computerColor)) {
                System.out.println("Brawo! Poprawna odpowiedź: " + computerColor);
                correctGuesses++;
            } else {
                System.out.println("Niestety, to nie ten kolor. Poprawna odpowiedź: " + computerColor);
            }
        }

        System.out.println("\nKoniec gry!");
        System.out.println("Liczba poprawnych odpowiedzi: " + correctGuesses + " z " + totalRounds);
    }
}