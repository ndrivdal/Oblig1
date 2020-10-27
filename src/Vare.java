public class Vare {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter

    public Vare(String navn, int antall, double pris) {
        //set() metodene blir ikke brukt så if checkene der blir heller ikke brukt,
        // kall på set() metodene i konstruktøren for å fikse dette Ellers alt bra
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // get / set metoder
    // antall og pris må være større enn null

    //SET
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        }
    }

    public void setAntall(int antall){
        if (antall >0){
            this.antall=antall;
        }
    }

    //GET
    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }


    // metode for å beregne totalpris (pris * antall)
    public double totalPris() {
        double utPris = pris * antall;
        return utPris;
    }
}