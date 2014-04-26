package Pflanzen;
import dm.methoden.PrintMethoden;

/**
 * Abstrakte Klasse Pflanze
 * @author Dominique/_k
 *
 */
public abstract class Pflanze {
    public String farbe;
    public double preis;
    public String bezeichnung;
    
    public void wachsen() {
        PrintMethoden.pupupunkt();
        System.out.println("Die Pflanze ist gewachsen.");
    }
    
    public void vertrocknen() {
        PrintMethoden.pupupunkt();
        System.out.println("Die Pflanze ist leider vertrocknet.");
    }
    
    public abstract String toString();
    
    public String getArt() {
        String s = this.getClass().toString();
        String art = s.substring(15);   //15, weil "class Pflanzen."
        return art;
    }
    
    public abstract Pflanze deepCopy();
    
}
