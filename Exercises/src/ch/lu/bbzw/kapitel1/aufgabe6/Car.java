package ch.lu.bbzw.kapitel1.aufgabe6;

public class Car extends Vehicle {

	public Car(int vehicleNr, String description, String indicator, byte amountOfCylinders, Model model) {
		super(vehicleNr, description);
		new Engine(amountOfCylinders, model);
	}
}
