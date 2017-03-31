package ch.lu.bbzw.block3.exercise3.athletes;

public class Surfer extends Athlete {

    public Surfer(String name, String prename) {
        super(name, prename);
    }

    @Override
    public String typ() {
        return super.typ() + " ein Surfer";
    }

    @Override
    public void wheatherChange(String sWetter, String oldWeather) {
        if (sWetter.contains("Regen")) {
            stop();
        } else {
            start();
        }
    }

}
