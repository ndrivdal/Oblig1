public class Vare {
    public String navn;
    public int antall;
    public double pris;

    // Konstruktør med alle attributter


    // get / set metoder

    // antall og pris må være større enn null

    // metode for å beregne totalpris (pris * antall)
    public double totalPris() {
        double utPris = pris * antall;
        return utPris;
    }
}