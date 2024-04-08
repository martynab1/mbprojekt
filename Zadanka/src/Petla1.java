import java.util.Scanner;

public class Petla1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią niezerową liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        scanner.close();

        int suma = 0;
        for (int i = 1; i <= liczba; i++) {
            suma += i;
        }

        System.out.println("Suma liczb od 1 do " + liczba + " wynosi: " + suma);
    }
}
