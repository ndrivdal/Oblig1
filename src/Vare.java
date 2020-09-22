public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter
    public Vare(String vareNavn, int vareAntall, double varePris) {
        if(vareAntall < 1) {
            vareAntall = 1;
        }
        if(varePris < 1) {
            varePris = 1;
        }
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
    public void setNavn(String innNavn) {
        navn = innNavn;
    }
    public void setPris(double innPris) {
        pris = innPris;
    }
    public void setAntall(int innAntall) {
        antall = innAntall;
    }



    // antall og pris må være større enn null



    // metode for å beregne totalpris (pris * antall)
    public double totalPris() {
        double utPris = pris * antall;
        return utPris;
    }
}