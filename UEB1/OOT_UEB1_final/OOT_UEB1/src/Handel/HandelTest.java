package Handel;

import Pflanzen.*;

public class HandelTest {

    public static void main(String[] args) {
        Blumenladen sunnyday = new Blumenladen("Sunny Day");
        
        Himbeerstrauch h23 = new Himbeerstrauch("rund", "lila");
        
        sunnyday.einkaufen(new Himbeerstrauch());
        sunnyday.einkaufen(h23, 2);
              
        sunnyday.einkaufen(new Venusfliegenfalle());
        
        Sonnentau st = new Sonnentau();
        
        sunnyday.einkaufen(st);
        
        for (int i = 0; i<5; i++) {
            sunnyday.verkaufen(new Himbeerstrauch());
        }
        
        sunnyday.einkaufen(new Venusfliegenfalle(), 35);
        
        
    }

}
