package Pflanzen;
import dm.methoden.PrintMethoden;

public abstract class Fleischfresser extends Pflanze {
    public String blaetter;
    
    public void verdauen() {
        PrintMethoden.pupupunkt();
        System.out.println("Die Mahlzeit ist verdaut.");
    }
}
