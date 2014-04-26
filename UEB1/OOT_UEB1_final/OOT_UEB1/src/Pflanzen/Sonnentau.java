package Pflanzen;

public class Sonnentau extends Fleischfresser {
    public String bezeichnung = "Sonnentau";
    public String blaetter = "lang und klebrig";
    public String farbe = "grün";
    public double preis = 4.0;
    
    public Sonnentau() {   
    }

    @Override
    public String toString() {
        return bezeichnung + " kostet " + preis + " Euro und ist " + 
                       farbe + ". Die Blätter sind " + blaetter + ".";
    }

    @Override
    public Sonnentau deepCopy() {
        Sonnentau s = new Sonnentau();
        s.bezeichnung = this.bezeichnung;
        s.preis = this.preis;
        s.farbe = this.farbe;
        s.blaetter = this.blaetter;
        return s;    }
    }
