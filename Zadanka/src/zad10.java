import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {

        Scanner imie = new Scanner(System.in);
        System.out.println("Podaj imie");
        String firstName= imie.nextLine();
        imie.nextLine();
        System.out.println("Podaj drugie imie");
        String middleName= imie.nextLine();
        imie.nextLine();
        System.out.println("Podaj Nazwisko");
        String lastName= imie.nextLine();
        imie.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Twoje imie to: "+ firstName+" Drugie imie to: "+middleName+" Nazwisko to: "+lastName);
        System.out.println("Inicjały pirwszego imienia to: "+firstInitial+" Drugiego to: "+middleInitial+" Trzciego to: "+lastInitial);
    }
}
