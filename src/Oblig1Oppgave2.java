import static javax.swing.JOptionPane.*;

public class Oblig1Oppgave2 {
    public static void main(String[] args){

        // les inn navn, antall og pris for vare 1
        String innNavn1 = showInputDialog("Skriv inn navn på vare 1");
        String innAntall1 = showInputDialog("Skriv inn antall varer");
        String innPris1 = showInputDialog("Skriv pris på vare 1");

        // les inn navn, antall og pris for vare 2
        String innNavn2 = showInputDialog("Skriv inn navn på vare 2");
        String innAntall2 = showInputDialog("Skriv inn antall varer");
        String innPris2 = showInputDialog("Skriv inn pris på vare 2");

        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2
        int antall1, antall2;
        double pris1, pris2;

        try {
            antall1 = Integer.parseInt(innAntall1);
        }
        catch(Exception e) {
            antall1 = 1;
        }

        try {
            antall2 = Integer.parseInt(innAntall2);
        }
        catch(Exception e) {
            antall2 = 1;
        }

        try {
            pris1 = Double.parseDouble(innPris1);
        }
        catch(Exception e) {
            pris1 = 0;
        }

        try {
            pris2 = Double.parseDouble(innPris2);
        }
        catch(Exception e) {
            pris2 = 0;
        }

        // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(innNavn1, antall1, pris1);
        Vare vare2 = new Vare(innNavn2, antall2, pris2);

        // beregn og skriv ut total pris for alle varer i System.out
        double totalPris = vare1.totalPris() + vare2.totalPris();
        System.out.println(totalPris);

    }

}
