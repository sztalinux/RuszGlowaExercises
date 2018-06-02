package ZatopicPortal;

public class ProstyPortal {
    private int[] polaPolozenia;
    private int iloscTrafien;

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudlo";
        for (int pole : polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (iloscTrafien == polaPolozenia.length) {
            wynik = "zatopiony";
        }
        System.out.println(wynik);
        return wynik;
    }
}
