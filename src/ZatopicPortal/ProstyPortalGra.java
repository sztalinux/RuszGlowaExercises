package ZatopicPortal;

public class ProstyPortalGra {
    public void start(){
        int iloscRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal portal = new ProstyPortal();
        int liczbaLosowa = (int)(Math.random() * 5);
        int[] polozenie = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};
        portal.setPolaPolozenia(polozenie);
        boolean czyIstnieje = true;
        while(czyIstnieje){
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbe");
            String wynik = portal.sprawdz(pole);
            iloscRuchow++;
            if (wynik.equals("zatopiony")){
                czyIstnieje = false;
                System.out.println(iloscRuchow + "ruchow");
            }
        }
    }
}
