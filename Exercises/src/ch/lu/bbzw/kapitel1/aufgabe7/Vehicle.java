package ch.lu.bbzw.kapitel1.aufgabe7;

public abstract class Vehicle {
	private String licenceNumber;
	private String brand;
	private String type;
	private Person owner;

	public Vehicle(String licenceNumber, String brand, String type) {
		this.licenceNumber = licenceNumber;
		this.brand = brand;
		this.type = type;
	}

	public Vehicle(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public abstract void dataPrint();

}
