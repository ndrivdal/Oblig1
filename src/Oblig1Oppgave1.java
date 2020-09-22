import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        //  Sett en variabel lik en verdi for radius
    double radius = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn radius: "));

    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */
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