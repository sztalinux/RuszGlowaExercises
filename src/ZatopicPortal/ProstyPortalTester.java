package ZatopicPortal;

public class ProstyPortalTester {
    public void test() {
        ProstyPortal wit = new ProstyPortal();
        int[] polozenia = {2, 3, 4};
        wit.setPolaPolozenia(polozenia);
        String wybranePole = "2";
        String wynik = wit.sprawdz(wybranePole);
        String wynikTestu = "niepowodzenie";
        if (wynik.equals("trafiony")) {
            wynikTestu = "zakonczony pomyslnie";
        }
        System.out.println(wynikTestu);
    }
}
