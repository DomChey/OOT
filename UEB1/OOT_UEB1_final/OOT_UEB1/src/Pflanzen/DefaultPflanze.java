package Pflanzen;

public class DefaultPflanze extends Pflanze {
    public String bezeichnung = "virtuelle Platzhalterpflanze";
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return bezeichnung;
    }

    @Override
    public Pflanze deepCopy() {
        // TODO Auto-generated method stub
        return new DefaultPflanze();
    }

}
