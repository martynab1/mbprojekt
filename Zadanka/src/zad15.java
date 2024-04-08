import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);
        System.out.println("Podaj cene płytki: ");
        int cenadetaliczna=price.nextInt();

        double zysk=cenadetaliczna*0.4;

        System.out.println("Cena detaliczna płytki jest równa: "+cenadetaliczna+" Zysk wynosi: "+zysk);
    }
}
