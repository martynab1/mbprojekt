import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);
        System.out.println("Podaj cene posiłku: ");
        int cena=price.nextInt();

        double podatek=cena*0.0675;

        double cenaPodatek=cena+podatek;

        double napiwek=cenaPodatek*0.2;

        double finalowaCena=cenaPodatek+napiwek;

        System.out.println("Cena posiłku równa się: "+cena+" Podatek wynosi: "+podatek+" Napiwek wynosi: "+napiwek+" Cena finalowa: "+finalowaCena);
    }
}
