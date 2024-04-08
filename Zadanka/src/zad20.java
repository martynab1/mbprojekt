import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {

        int ciasteczka=48;
        double cukier=1.5;
        int maslo = 1;
        double maka = 2.75;

        Scanner amount = new Scanner(System.in);
        System.out.println("Podaj liczbę ciasteczek: ");
        int ilosc =amount.nextInt();

        double przepis= ilosc/ciasteczka;

        double przepis2 = przepis * cukier;

        double przepis3 = przepis * maslo;

        double przepis4 = przepis * maka;

        System.out.println("Żeby upiec "+ilosc+" ciasteczek potrzeba:");
        System.out.println("Cukier: "+przepis2+" Maslo: "+przepis3+" Maka: "+przepis4);
    }
}
