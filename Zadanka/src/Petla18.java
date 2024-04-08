
import java.util.Random;
import java.util.Scanner;

public class Petla18 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int wylosowanaLiczba = random.nextInt(max - min + 1) + min;
        int liczbaProb = 0;

        System.out.println("Witaj! Zgadnij liczbę z zakresu od " + min + " do " + max + ".");

        int zgadywanaLiczba;
        do {
            System.out.print("Podaj swoją propozycję: ");
            zgadywanaLiczba = scanner.nextInt();
            liczbaProb++;

            if (zgadywanaLiczba > wylosowanaLiczba) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (zgadywanaLiczba < wylosowanaLiczba) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            } else {
                System.out.println("Brawo! Zgadłeś!");
                System.out.println("Liczba prób: " + liczbaProb);
            }
        } while (zgadywanaLiczba != wylosowanaLiczba);

        scanner.close();
    }
}




