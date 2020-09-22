public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter

    public Vare(String vareNavn, int vareAntall, double varePris) {
        this.navn = vareNavn;
        this.antall = vareAntall;
        this.pris = varePris;
    }

    // get / set metoder
    // antall og pris må være større enn null

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        }
    }
    public double getPris() {
        return pris;
    }

    public void setAntall(int antall){
        if (antall >0){
            this.antall=antall;
        }
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