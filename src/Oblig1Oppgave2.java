import javax.swing.*;

public class Oblig1Oppgave2 {


        public static void main(String[] args){
                
                String innNavn= JOptionPane.showInputDialog("Skriv inn et navn");
                String innAntall= JOptionPane.showInputDialog("Skriv inn antall varer");
                int antall;
                try{
                        Integer.parseInt(innAntall);
                }
                catch (Exception e){
                        antall = 0;
                }

                String innPris= JOptionPane.showInputDialog("SKriv inn en pris");
                int pris;
                try{
                        Integer.parseInt(innPris);
                }
                catch (Exception e){
                        pris = 0;
                }

                // les inn navn, antall og pris for vare 1

                Vare vare1 = new Vare();
                vare1.navn= innNavn;
                vare1.antall= innAntall;
                vare1.pris = pris;

            // les inn navn, antall og pris for vare 2

                Vare vare2 = new Vare();
                vare2.navn= innNavn;
                vare2.antall= innAntall;
                vare2.pris = pris;

            // bruk avvikshåntering (try/catch) for å konvertere
            // antall og pris for vare 1 og vare 2

            // opprett to vare-objekter med de innleste verdiene

            // beregn og skriv ut total pris for alle varer i System.out


        }

}
