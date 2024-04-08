public class zad22 {
    public static void main(String[] args) {

        int liczbaZakupionychAkcji = 1000;
        double cenaZakupuAkcji = 32.87;
        double prowizjaZakupu = 0.02;


        double cenaSprzedazyAkcji = 33.92;
        double prowizjaSprzedazy = 0.02;


        double kwotaZaplaconaZaAkcje = liczbaZakupionychAkcji * cenaZakupuAkcji;
        double prowizjaZaplaconaPrzyZakupie = kwotaZaplaconaZaAkcje * prowizjaZakupu;
        double kwotaOtrzymanaZeSprzedazy = liczbaZakupionychAkcji * cenaSprzedazyAkcji;
        double prowizjaZaplaconaPrzySprzedazy = kwotaOtrzymanaZeSprzedazy * prowizjaSprzedazy;
        double zyskPoProwizjach = kwotaOtrzymanaZeSprzedazy - prowizjaZaplaconaPrzySprzedazy
                - kwotaZaplaconaZaAkcje - prowizjaZaplaconaPrzyZakupie;

        System.out.println("Kwota zapłacona za akcje: " + kwotaZaplaconaZaAkcje + " zł");
        System.out.println("Wartość prowizji przy zakupie: " + prowizjaZaplaconaPrzyZakupie + " zł");
        System.out.println("Kwota otrzymana ze sprzedaży akcji: " + kwotaOtrzymanaZeSprzedazy + " zł");
        System.out.println("Wartość prowizji przy sprzedaży: " + prowizjaZaplaconaPrzySprzedazy + " zł");
        System.out.println("Zysk po zapłaceniu obu prowizji: " + zyskPoProwizjach + " zł");
    }
}
