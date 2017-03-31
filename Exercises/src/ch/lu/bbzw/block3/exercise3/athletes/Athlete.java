package ch.lu.bbzw.block3.exercise3.athletes;

import ch.lu.bbzw.block3.exercise3.Meteo;
import ch.lu.bbzw.block3.exercise3.Person;

public abstract class Athlete extends Person {

	public Athlete(String name, String prename) {
		super(name, prename);
		Meteo.addWheaterChangeListener(this::wheatherChange);
	}

	protected void start() {
		System.out.println(super.typ() + ". Ich starte das Spiel.");
	}

	public void stop() {
		System.out.println(super.typ() + ". Ich stoppe das Spiel.");
	}

	public abstract void wheatherChange(String newWheather, String oldWheather);
}
