import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dzień");
        int dzien = input.nextInt();
        input.nextLine();
        System.out.println("Podaj miesiac");
        int miesiac = input.nextInt();
        input.nextLine();
        System.out.println("Podaj 2 ostatnie cyfryroku");
        int rok = input.nextInt();
        input.nextLine();

        if(dzien*miesiac==rok){
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
