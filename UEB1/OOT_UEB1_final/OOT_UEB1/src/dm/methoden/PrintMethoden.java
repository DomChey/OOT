package dm.methoden;

public abstract class PrintMethoden {
    /**
     * Punkt ... Punkt ... Punkt
     */
    public static void pupupunkt() {
        System.out.print("  ");
        for (int i = 0; i < 3; i++) {
            System.out.print("  .");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    
    /**
     * Erzeugt nach 1,5 Sekunden zwei Leerzeilen.
     */
    public static void newLine() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
    }
}
