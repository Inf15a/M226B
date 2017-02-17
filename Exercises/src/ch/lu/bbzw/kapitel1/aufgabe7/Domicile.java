package ch.lu.bbzw.kapitel1.aufgabe7;

public class Domicile {

	private String zipCode;
	private String city;
	private String street;

	public Domicile(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public Domicile() {
		// TODO Auto-generated constructor stub
	}

	public void setZIPCode(String zipCode) {
		this.zipCode = zipCode;

	}

	public void setCity(String city) {
		this.city = city;

	}

	public void setStreet(String street) {
		this.street = street;
		// TODO Auto-generated method stub

	}

}
