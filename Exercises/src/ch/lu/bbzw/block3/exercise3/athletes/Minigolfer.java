package ch.lu.bbzw.block3.exercise3.athletes;

public class Minigolfer extends Athlete {

    public Minigolfer(String name, String prename) {
        super(name, prename);
    }

    @Override
    public String typ() {
        return super.typ() + " ein Minigolfer";
    }

    @Override
    public void wheatherChange(String newWheather, String oldWheather) {
        if (newWheather.contains("Regen")) {
            stop();
        } else {
            start();
        }
    }
}
