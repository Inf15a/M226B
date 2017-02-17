package ch.lu.bbzw.kapitel1.aufgabe6;

public abstract class Vehicle {
	private int vehicleNr;
	private String description;

	public Vehicle(int vehicleNr, String description) {
		this.setVehicleNr(vehicleNr);
		this.setDescription(description);
	}

	public int getVehicleNr() {
		return vehicleNr;
	}

	public void setVehicleNr(int vehicleNr) {
		this.vehicleNr = vehicleNr;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
