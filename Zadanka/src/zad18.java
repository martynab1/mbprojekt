public class zad18 {
    public static void main(String[] args) {

        double akcja=600;
        double cenaAkcji=21.77;

        double price=akcja*cenaAkcji;

        double prowizja=price*0.02;

        double cenaZprowizja=price+prowizja;

        System.out.println("Kwota akcji wynosi: "+price+" Prowzcja wynosi: "+prowizja+" Cena finalna wynosi: "+cenaZprowizja+" zł");
    }
}
