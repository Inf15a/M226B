package ch.lu.bbzw.block3.exercise3.athletes.footballplayers;

import ch.lu.bbzw.block3.exercise3.athletes.Athlete;

public class FootballPlayer extends Athlete {
    private Position position;

    public FootballPlayer(String name, String prename, Position position) {
        super(name, prename);
        this.position = position;
    }

    @Override
    public String typ() {
        return super.typ() + " ein Fussballspieler" + position.getPosition();
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
