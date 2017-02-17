package ch.lu.bbzw.kapitel1.aufgabe7;

public abstract class VehicleWithEngine extends Vehicle {

	private Engine engine = null;

	public VehicleWithEngine(String licenceNumber, String brand, String type, int ccm, int ps, int cylinder,
			EngineTypes engineType) {
		super(licenceNumber, brand, type);
		this.setEngine(new Engine(engineType, ccm, ps, cylinder));
	}

	public VehicleWithEngine(String licenceNumber, String brand, String type) {
		super(licenceNumber, brand, type);
		this.engine = new Engine();
	}

	public VehicleWithEngine(String licenceNumber) {
		super(licenceNumber);
		this.engine = new Engine();
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void dataPrint() {
		System.out.println("Licence number  :" + getLicenceNumber());
		System.out.println("Brand           :" + getBrand());
		System.out.println("Type            :" + getType());
		if (getOwner() != null)
			System.out.println("Owner           :" + getOwner());
		System.out.println("CCM             :" + getEngine().getCcm());
		System.out.println("PS              :" + getEngine().getPs());
		System.out.println("Cylinder amount :" + getEngine().getCylinder());
		if (getEngine().getEngineType() != null)
			System.out.println("Build type      :" + getEngine().getEngineType());
		else
			System.out.println("Build type      :not defined");
	}
}
