package Handel;

import dm.methoden.PrintMethoden;
import Pflanzen.*;

public class Blumenladen implements VerkaufInterface{

    public String name;
    public Pflanze lager[] = new Pflanze[40];
    int freiImLager = 40;
    
    /**
     * Erzeugt neuen Blumenladen mit dem Namen name
     * @param name
     */
    public Blumenladen (String name){
        this.name = name;
        lagerDefaultAuffuellen();
    }
    
    /**
     * setzt alle Plätze im Lager auf DefaultPflanze
     */
    private void lagerDefaultAuffuellen() {
        for (int i=0; i<lager.length; i++)
            if (lager[i] == null) {
                lager [i] = new DefaultPflanze();
            }
    }
    

    @Override
    /**
     * Verkauft die Pflanze p
     * @param p zu verkaufende Pflanze
     * @return true, wenn Verkauf erfolgreich
     */
    public boolean verkaufen(Pflanze p) {
        boolean vorraetig = false;
        int i = 0;
        System.out.println("Ein(e) " + p.getArt() + " soll verkauft werden.");
        PrintMethoden.pupupunkt();
        
        System.out.println("Im Lager wird nach der Pflanze gesucht. " +
                "Das kann einen Moment dauern.");
        PrintMethoden.pupupunkt();
        
        
        while (!vorraetig && i < lager.length) {
            if(lager[i].getClass() == p.getClass()) {
                vorraetig = true;
            }
            i++;
        }
        i--; //da 1 zu weit gezählt wird
        
        if(vorraetig) {
            System.out.println("Die Pflanze " + p.getArt() + " ist vorrätig " + 
                    "und wird aus dem Lager geholt.");
            PrintMethoden.pupupunkt();
           
            lager[i] = new DefaultPflanze();    //Pflanze aus Lager löschen
            freiImLager++;
            System.out.println("Der Kunde bezahlt die Pflanze.");
            PrintMethoden.pupupunkt();
            System.out.println("Der Kunde erhält die Pflanze.");
        } else {
            System.out.println("Die Pflanze " + p.getArt() + " ist nicht" +
                    " vorrätig. Der Kunde erhält keine Pflanze. \n" + 
                    "Die Pflanze wird beim Lieferanten bestellt.");
            einkaufen(p);
        }
        
        PrintMethoden.newLine();       
        return vorraetig;
    }

    /**
     * Kauft eine der Pflanzen 
     * @param p
     * @return true, wenn Einkauf erfolgreich
     */
    public boolean einkaufen(Pflanze p) {
       return einkaufen(p,1);
    }
    
    private int naechstesFreiesFeld() {
        int i = 0;
        while (lager[i].getClass() != DefaultPflanze.class) {
            i++;
        }
        return i;
    }
    
    /**
     * Kauft n Mal die Pflanze p
     * @param p
     * @param n
     * @return true, wenn Einkauf erfolgreich
     */
    public boolean einkaufen(Pflanze p, int n) {
        boolean erfolgreich = false;
        System.out.println(n + "x " + p.getArt() + " wird eingekauft.");
        
        if (freiImLager < n) {
            PrintMethoden.pupupunkt();
            System.out.println("Es ist zu wenig Platz im Lager.");
        } else {
            if (n < 30) { // (n<30 && dMarkt.vorraetig(p)) <-- nicht implementiert
                System.out.println("Die Pflanze(n) werden beim "+
                        "Direktvermarkter 'direktMarkt' bestellt.");
                pflanzeAbholen(p, n);
            } else {
                PrintMethoden.pupupunkt();
                System.out.println("Die Pflanzen werden beim Großhändler " +
                        "bestellt.");
                PrintMethoden.pupupunkt();
                System.out.println("Das kann bis zu einem Tag dauern.");
                PrintMethoden.pupupunkt();
                PrintMethoden.pupupunkt();
            }
            for (int i = 0; i < n; i++) {
                int nextFrei = naechstesFreiesFeld();
                lager[nextFrei] = p.deepCopy();
                freiImLager--;
                erfolgreich = true;             
            }
            PrintMethoden.pupupunkt();   
            System.out.println(n + " Pflanze(n) der Art " + p.getArt() + 
                    " liegen jetzt im Lager bereit.");
            erfolgreich = true;
        }        
        
        PrintMethoden.newLine();
        return erfolgreich;
    }

    /**
     * Holt n Pflanzen der Art p beim Direktvermarkter ab
     * @param p
     * @param n
     * @return true, wenn Abholen erfolgreich
     */
    private boolean pflanzeAbholen(Pflanze p, int n) {
        PrintMethoden.pupupunkt();
        System.out.println(n + "x " + p.getArt() + " wurde gerade abgeholt.");
        return true;
    }

}
