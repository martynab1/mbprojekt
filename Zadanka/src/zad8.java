import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        Scanner pokoj = new Scanner(System.in);

        System.out.println("Podaj dlugosc pokoju nr1");
        int dlugoscPokoju1 = pokoj.nextInt();
        pokoj.nextLine();

        System.out.println("Podaj szerokosc pokoju nr1");
        int szerokoscPokoju1 =pokoj.nextInt();
        pokoj.nextLine();

        System.out.println("Podaj dlugosc pokoju nr2");
        int dlugoscPokoju2 = pokoj.nextInt();
        pokoj.nextLine();

        System.out.println("Podaj szerokosc pokoju nr2");
        int szerokoscPokoju2 =pokoj.nextInt();

        int calkowitaPowierzchnia= dlugoscPokoju1*szerokoscPokoju1+dlugoscPokoju2*szerokoscPokoju2;

        System.out.println("Powierzchnia całkowita mieszkania wynosi:"+calkowitaPowierzchnia);
    }
}
