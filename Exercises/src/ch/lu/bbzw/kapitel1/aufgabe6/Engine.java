package ch.lu.bbzw.kapitel1.aufgabe6;

public class Engine {

	private byte amountOfCylinders;
	private Model model;

	public Engine(byte amountOfCylinders, Model model) {
		this.setAmountOfCylinders(amountOfCylinders);
		this.setModel(model);
	}

	public byte getAmountOfCylinders() {
		return amountOfCylinders;
	}

	public void setAmountOfCylinders(byte amountOfCylinders) {
		this.amountOfCylinders = amountOfCylinders;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
}
