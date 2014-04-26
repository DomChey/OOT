package Pflanzen;

import dm.methoden.PrintMethoden;

public class Himbeerstrauch extends Strauch {
    public String bezeichnung = "Himbeerstrauch";
    public double preis = 5.0;
    public String frucht = "Himbeere";
    
    /**
     * Standardmäßig sind die Blätter glatt und grün.
     */
    public Himbeerstrauch() {
        blaetter = "glatt";
        farbe = "grün";
    }
    /**
     * Konstruktor mit frei wählbaren Blättern und Farbe
     * @param blaetter Art als <code>String</code>
     * @param farbe Farbe als <code>String</code>
     */
    public Himbeerstrauch(String blaetter, String farbe) {
        this.blaetter = blaetter;
        this.farbe = farbe;
    }
    
    public void pieken() {
        System.out.println("Achtung der Strauch piekt! /n");
        PrintMethoden.pupupunkt();
        System.out.println("Autsch!!");
    }
    
    public void verbluehen() {
        PrintMethoden.pupupunkt();
        System.out.println("Schade. Der Strauch ist verblüht.");
    }
    
    @Override
    public String toString() {
        return "Dieser Himbeerstrauch hat " + blaetter + "e Blätter und ist " +
                farbe + ".";
    }
    @Override
    public Himbeerstrauch deepCopy() {
        Himbeerstrauch h = new Himbeerstrauch(this.blaetter, this.farbe);
        h.bezeichnung = this.bezeichnung;
        h.preis = this.preis;
        h.frucht = this.frucht;
        return h;
    }

}
