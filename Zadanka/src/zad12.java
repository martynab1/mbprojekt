import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {

        Scanner fuel = new Scanner(System.in);
        System.out.println("Podaj ilośc przejechanych kilometrów: ");
        int km =fuel.nextInt();
        fuel.nextLine();

        System.out.println("Podaj ilość spalonego paliwa (w litrach): ");
        int paliwo=fuel.nextInt();
        fuel.nextLine();

        int iloscKM = km / paliwo;
        System.out.println("Liczba kilometró n litrze paliwa wynosi: "+iloscKM);
    }
}
