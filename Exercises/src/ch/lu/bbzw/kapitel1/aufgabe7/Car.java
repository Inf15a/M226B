package ch.lu.bbzw.kapitel1.aufgabe7;

public class Car extends VehicleWithEngine {

	public Car(String licenceNumber, String brand, String type, int ccm, int ps, int cylinder, EngineTypes engineType) {
		super(licenceNumber, brand, type, ccm, ps, cylinder, engineType);
	}

	public Car(String licenceNumber, String brand, String type) {
		super(licenceNumber, brand, type);
	}

	public Car(String licenceNumber) {
		super(licenceNumber);
	}
}
