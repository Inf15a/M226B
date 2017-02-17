package ch.lu.bbzw.kapitel1.aufgabe7;

public class Program {

	public static void main(String[] args) {
		//  Fahrzeugobjekte anlegen
		Car a1 = new Car("LU 25958", "Toyota", "Corolla");
		Car a2 = new Car("LU 122298");
		a2.setBrand("Volvo");
		a2.setType("V40");
		a2.getEngine().setCCM(1800); // ccm
		a2.getEngine().setPS(135); // PS
		a2.getEngine().setCylinder(4); // Zylinder
		a2.getEngine().setEngineType(EngineTypes.IN_LINE_ENGINE);
		Car a3 = new Car("LU 64624", "VW", "Käfer", 1500/* ccm */, 70/* PS */, 4 /* Zylinder */,
				EngineTypes.FLAT_ENGINE);
		//
		MotoCycle m1 = new MotoCycle("LU 14062", "Kawasaki", "Zephir");
		MotoCycle m2 = new MotoCycle("LU 14064");
		m2.setBrand("Piaggio");
		m2.setType("Vespa");
		m2.getEngine().setCCM(125);
		m2.getEngine().setPS(8);
		m2.getEngine().setCylinder(1);
		MotoCycle m3 = new MotoCycle("LU 74256", "Yamaha", "XV Wildstar", 1600/* ccm */, 63/* PS */, 2/* Zylinder */,
				EngineTypes.V_ENGINE);
		//
		Bicycle f1 = new Bicycle("K124AS123", "Wheeler", "Cross1");
		Bicycle f2 = new Bicycle("D424AS144");
		f2.setBrand("Wheeler");
		f2.setType("Cross3");
		Bicycle f3 = new Bicycle("K123AD351", "Wheeler", "Cross3");

		VehicleIndex f = new VehicleIndex();
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(m1);
		f.add(m2);
		f.add(m3);
		f.add(f1);
		f.add(f2);
		f.add(f3);
		//  Personenobjekte erstellen
		Person p1 = new Person();
		p1.setPersNr(120);
		p1.setName("Gugerli");
		p1.setPrename("Armin");
		p1.getDomicile().setStreet("Schürstrasse");
		p1.getDomicile().setZIPCode("6020");
		p1.getDomicile().setCity("Emmenbruecke");
		Person p2 = new Person(123, "Bucher", "Roland", "Sonnbüel 13");
		p2.getDomicile().setZIPCode("6024");
		p2.getDomicile().setCity("Hildisrieden");
		Person p3 = new Person(130, "Waldburger", "Max", "Hauptweg 101", new Domicile("8805", "Freienbach"));
		//  Fahrzeuge den Personenobjekten zuweisen oder/und umgekehrt
		a1.setOwner(p2);
		m1.setOwner(p2);
		a2.setOwner(p2);
		p1.addCar(a2);
		p1.addCar(f2);
		//  Ausgabe aller Fahrzeuge
		System.out.println("*********************************");
		System.out.println("A L L E   F A H R Z E U G E     ");
		System.out.println("*********************************");
		for (int i = 0; i < f.getVehicleList().size(); i++) {
			Vehicle vehicle = f.getVehicleList().get(i);
			vehicle.dataPrint();
			System.out.println("----------------------------------");
		}
		System.out.println("*********************************");
		System.out.println("A L L E   P E R S O N  E N     ");
		System.out.println("*********************************");
		p1.dataPrint();
		p2.dataPrint();
		p3.dataPrint();
	}
}
