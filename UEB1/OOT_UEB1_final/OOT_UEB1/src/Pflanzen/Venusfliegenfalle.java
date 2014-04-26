package Pflanzen;

import dm.methoden.PrintMethoden;

public class Venusfliegenfalle extends Fleischfresser {
    public String bezeichnung = "Venusfliegenfalle";
    public String farbe = "grün-rot";
    public double preis = 3.0;
    public String blaetter = "aufklappbar und klebrig";
    
    public void fliegenFangen() {
        blaetterSchliessen();
        PrintMethoden.pupupunkt();
        System.out.println("Die Fliege ist gefangen.");
        verdauen();        
    }
    
    private void blaetterSchliessen() {
        PrintMethoden.pupupunkt();
        System.out.println("Blätter sind geschlossen.");
    }

    @Override
    public String toString() {
        return bezeichnung + " kostet " + preis + " Euro und ist " + 
                farbe + ". Die Blätter sind " + blaetter + ".";
    }

    @Override
    public Venusfliegenfalle deepCopy() {
        Venusfliegenfalle v = new Venusfliegenfalle();
        v.bezeichnung = this.bezeichnung;
        v.preis = this.preis;
        v.farbe = this.farbe;
        v.blaetter = this.blaetter;
        return v;
    }

}
