package ch.lu.bbzw.kapitel1.aufgabe7;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private int persNr;
	private String name;
	private String prename;
	private Domicile domicile;
	private List<Vehicle> cars = new ArrayList<>();

	public Person() {
		domicile = new Domicile();
	}

	public Person(int persNr, String name, String prename, String street) {
		domicile = new Domicile();
		this.persNr = persNr;
		this.name = name;
		this.prename = prename;
		domicile.setStreet(street);
	}

	public Person(int persNr, String name, String prename, String street, Domicile domicile) {
		this.persNr = persNr;
		this.name = name;
		this.prename = prename;
		this.domicile = domicile;
		this.domicile.setStreet(street);
	}

	public int getPersNr() {
		return persNr;
	}

	public String getName() {
		return name;
	}

	public String getPrename() {
		return prename;
	}

	public List<Vehicle> getCars() {
		return cars;
	}

	public void setPersNr(int persNr) {
		this.persNr = persNr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrename(String prename) {
		this.prename = prename;

	}

	public Domicile getDomicile() {
		return domicile;
	}

	public void addCar(Vehicle vehicle) {
		cars.add(vehicle);
	}

	public void dataPrint() {
		System.out.println("PersNr          :" + getPersNr());
		System.out.println("Name            :" + getName());
		System.out.println("Prename         :" + getPrename());
		for (Vehicle vehicle : cars) {
			System.out.println("Vehicle         :" + vehicle.getLicenceNumber() + " " + vehicle.getBrand() + " "
					+ vehicle.getType());
		}
		System.out.println("----------------------------------");
	}
}
