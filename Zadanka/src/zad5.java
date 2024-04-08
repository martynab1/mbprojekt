public class zad5 {
    public static void main(String[] args) {
        int dwaMieszkasznia = 2*3;
        int trzecieMieszkanie = 2*3;
        int czwarteMieszkanie = 2*2;

        int calkowitaPowierzchnia = dwaMieszkasznia + trzecieMieszkanie + czwarteMieszkanie;
        System.out.println("Powierzchnia całkowita mieszkania wynosi:"+calkowitaPowierzchnia);

        //zad6
        int powierzchnia = calkowitaPowierzchnia/4;
        System.out.println("Powierzchnia przypadajaca na 1 osobe (z 4) wynosi: "+powierzchnia);
    }
}
