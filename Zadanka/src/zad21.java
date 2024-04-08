
import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj ilosc pieniedzy na koncie(P): ");
        double principal = input.nextDouble();

        System.out.print("Podaj roczna stope oprocentowania (r): ");
        double rate = input.nextDouble();

        System.out.print("le razy w roku odsetki są doliczane do kapitału(n): ");
        int n = input.nextInt();

        System.out.print("Podaj przez ile lat(t): ");
        double time = input.nextDouble();


        double compoundInterest = principal * Math.pow((1 + rate / n), n * time);

        System.out.println("Zyskasz: $" + compoundInterest);
    }
}
