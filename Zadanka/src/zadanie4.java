import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszy wynik: ");
        int a= input.nextInt();
        input.nextLine();

        System.out.println("Podaj drugi wynik: ");
        int b= input.nextInt();
        input.nextLine();

        System.out.println("Podaj trzeci wynik: ");
        int c= input.nextInt();
        input.nextLine();

        double wynik=(a+b+c)/3;

        if (wynik>=90&wynik<=100){
            System.out.println("5");
        }

        else if (wynik>=80&wynik<=89){
            System.out.println("4");
        }

        else if (wynik>=70&wynik<=79){
            System.out.println("3");
        }

        else if (wynik>=60&wynik<=69){
            System.out.println("2");
        }
        else if (wynik<60){
            System.out.println("1");
        }
    }
}
