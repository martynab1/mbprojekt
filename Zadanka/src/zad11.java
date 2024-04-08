import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {

        Scanner cena = new Scanner(System.in);
        System.out.println("Podaj cene produktu:");
        int price = cena.nextInt();
        cena.nextLine();
        double podatekStanowy = price * 0.04;
        double podatekLokalny = price * 0.02;

        double price2= price+podatekStanowy+podatekLokalny;

        System.out.println("Cena produktu wynosi: "+price);
        System.out.println("Podatek stanowy wynosi: "+podatekStanowy+" Podatek lokalny wynosi: "+podatekLokalny);
        System.out.println("Pełna cena produktu wynosi: "+price2);
    }
}
