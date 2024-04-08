import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {

        Scanner oceny = new Scanner(System.in);
        System.out.println("Podaj pierwsza ocenę: ");
        int first = oceny.nextInt();
        oceny.nextLine();

        System.out.println("Podaj druga ocenę: ");
        int second = oceny.nextInt();
        oceny.nextLine();

        System.out.println("Podaj trzecia ocenę: ");
        int third = oceny.nextInt();
        oceny.nextLine();

        int srednia= (first+second+third)/3;
        System.out.println("Średnia ocen równa się: "+srednia);


    }
}
