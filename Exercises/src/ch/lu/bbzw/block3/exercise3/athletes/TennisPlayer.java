package ch.lu.bbzw.block3.exercise3.athletes;

public class TennisPlayer extends Athlete {

	public TennisPlayer(String name, String prename) {
		super(name, prename);

	}

	@Override
	public String typ() {
		return super.typ() + " ein Tennisspieler";
	}

	@Override
	public void wheatherChange(String sWetter, String oldWeather) {
		if (sWetter.contains("Regen"))
			stop();
		else
			start();
	}

}
