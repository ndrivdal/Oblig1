import static javax.swing.JOptionPane.*;

public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        //  Sett en variabel lik en verdi for radius
    double radius = Double.parseDouble(showInputDialog("Skriv inn radius: "));

        //  Kall så de statiske metodene i sirkel-klassen for å vise følgende på
        //  Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    double diameter = Sirkel.diameter(radius);
    String diameterMed2Desimaler = String.format("%.2f", diameter);
    System.out.println(" Diameteren til sirkelen er med radius "+radius+" er "+diameterMed2Desimaler);

    double areal = Sirkel.areal(radius);
    String arealMed2Desimaler = String.format("%.2f", areal);
    System.out.println("Arealet av sirkelen med radius "+radius+" er "+arealMed2Desimaler);

    double omkrets = Sirkel.omkrets(radius);
    String omkretsenMed2Desimaler = String.format("%.2f", omkrets);
    System.out.println("Omkretsen av sirkelen med radius "+radius+" er "+omkretsenMed2Desimaler);
    }
}