public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter
    public Vare(String vareNavn, int vareAntall, double varePris) {
        navn = vareNavn;
        antall = vareAntall;
        pris = varePris;
    }

    // get / set metoder
    // Get
    public String getNavn() {
        return navn;
    }
    public double getPris() {
        return pris;
    }
    public int getAntall() {
        return antall;
    }

    // Set




    // antall og pris må være større enn null


    // metode for å beregne totalpris (pris * antall)
    public double totalPris() {
        double utPris = pris * antall;
        return utPris;
    }
}