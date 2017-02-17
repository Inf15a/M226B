package ch.lu.bbzw.kapitel1.aufgabe7;

public class Bicycle extends Vehicle {

	public Bicycle(String licenceNumber, String brand, String type) {
		super(licenceNumber, brand, type);
	}

	public Bicycle(String licenceNumber) {
		super(licenceNumber);
	}

	@Override
	public void dataPrint() {
		System.out.println("Brand           :" + getBrand());
		System.out.println("Type            :" + getType());
		if (getOwner() != null)
			System.out.println("Owner           :" + getOwner());
	}
}
