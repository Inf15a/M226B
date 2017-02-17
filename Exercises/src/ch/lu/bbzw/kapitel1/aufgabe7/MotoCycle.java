package ch.lu.bbzw.kapitel1.aufgabe7;

public class MotoCycle extends VehicleWithEngine {

	public MotoCycle(String licenceNumber, String brand, String type, int ccm, int ps, int cylinder,
			EngineTypes engineType) {
		super(licenceNumber, brand, type, ccm, ps, cylinder, engineType);
	}

	public MotoCycle(String licenceNumber, String brand, String type) {
		super(licenceNumber, brand, type);
	}

	public MotoCycle(String licenceNumber) {
		super(licenceNumber);
	}
}
