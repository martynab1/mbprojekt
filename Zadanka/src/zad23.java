import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość rzędu winogron w metrach:");
        double dlugoscRzedu = scanner.nextDouble();

        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach:");
        double okratowanie = scanner.nextDouble();

        System.out.println("Podaj odległość między sadzonkami w metrach:");
        double odlegloscSadzonek = scanner.nextDouble();

        double liczbaSadzonek = (dlugoscRzedu - 2 * okratowanie) / odlegloscSadzonek;

        System.out.println("Liczba sadzonek, jakie zmieszczą się w rzędzie: " + liczbaSadzonek);
    }
}
