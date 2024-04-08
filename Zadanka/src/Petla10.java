import java.util.Scanner;

public class Petla10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Podawaj liczby całkowite (wpisz -99, aby zakończyć):");

        while (true) {
            int input = scanner.nextInt();
            if (input == -99) {
                break;
            }

            min = Math.min(min, input);
            max = Math.max(max, input);
        }

        System.out.println("Najmniejsza wprowadzona wartość: " + min);
        System.out.println("Największa wprowadzona wartość: " + max);
    }
}
