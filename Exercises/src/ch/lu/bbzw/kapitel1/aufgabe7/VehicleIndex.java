package ch.lu.bbzw.kapitel1.aufgabe7;

import java.util.ArrayList;
import java.util.List;

public class VehicleIndex {
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void add(Vehicle vehicle) {
		getVehicleList().add(vehicle);
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}
}
