import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wzrost ciała (w m): ");
        double wzrost= input.nextDouble();
        input.nextLine();
        System.out.println("Podaj wagę ciała (w kg): ");
        int waga= input.nextInt();
        input.nextLine();

        double BMI = waga/wzrost;

        if(BMI>18.5&BMI<25){
            System.out.println("Prawidłowa waga ciała");
        }
        else if(BMI>25){
            System.out.println("Nadwaga");
        }
        else if(BMI<18.5){
            System.out.println("Niedowaga");
        }

    }
}
