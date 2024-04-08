import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {

        Scanner city = new Scanner(System.in);
        System.out.println("Podaj nazwe ulubionego miasta: ");
        String miasto =city.nextLine();

        int dlugosc =miasto.length();

        String duze,male;

        duze=miasto.toUpperCase();
        male=miasto.toLowerCase();

        char pierwsza = miasto.charAt(0);

        System.out.println("Twoje ulubione miasto to: "+miasto+" ilosc znakow to: "+dlugosc);
        System.out.println(duze);
        System.out.println(male);
        System.out.println("Pierwsza litera: "+pierwsza);

    }
}
