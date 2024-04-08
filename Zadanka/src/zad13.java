import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {

        Scanner cookies = new Scanner(System.in);
        System.out.println("Podaj ilośc zjedzonych ciasteczek: ");
        int ciastka = cookies.nextInt();

        int porcja = ciastka/4;

        int kalorie = porcja*300;

        System.out.println("Zjadłeś: "+ciastka+" ciastek, równa sie to: "+kalorie+" kalori");
    }
}
