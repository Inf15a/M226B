package ch.lu.bbzw.kapitel1.aufgabe7;

public class Engine {

	private EngineTypes engineType;
	private int ccm;
	private int ps;
	private int cylinder;

	public Engine(EngineTypes engineType, int ccm, int ps, int cylinder) {
		this.engineType = engineType;
		this.ccm = ccm;
		this.ps = ps;
		this.cylinder = cylinder;
	}

	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public EngineTypes getEngineType() {
		return engineType;
	}

	public int getCcm() {
		return ccm;
	}

	public int getPs() {
		return ps;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCCM(int ccm) {
		this.ccm = ccm;

	}

	public void setPS(int ps) {
		this.ps = ps;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public void setEngineType(EngineTypes engineType) {
		this.engineType = engineType;

	}

}
