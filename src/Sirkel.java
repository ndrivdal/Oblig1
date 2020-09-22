public class Sirkel {
    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double diameter(double radius) {
        double utDiameter = radius*2;
        return utDiameter;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double omkrets(double radius) {
        double utRadius = 2 * Math.PI * radius;
        return utRadius;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    public static double areal(double radius) {
        double utAreal = Math.PI * Math.pow(radius, 2);
        return utAreal;
    }
}