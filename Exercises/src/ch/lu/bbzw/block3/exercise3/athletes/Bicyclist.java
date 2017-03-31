package ch.lu.bbzw.block3.exercise3.athletes;

public class Bicyclist extends Athlete {

    public Bicyclist(String name, String prename) {
        super(name, prename);
    }

    @Override
    public String typ() {
        return super.typ() + " ein Velofahrer";
    }

    @Override
    public void wheatherChange(String newWheather, String oldWheather) {
        // i dont Care
    }

}
