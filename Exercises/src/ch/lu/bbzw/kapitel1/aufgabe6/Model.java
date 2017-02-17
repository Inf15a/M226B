package ch.lu.bbzw.kapitel1.aufgabe6;

public enum Model {
	IN_LINE_ENGINE(100), FLAT_ENGINE(190), V_ENGINE(230), WANKEL_ENGINE(4000), ELECTRIC_ENGINE(1000);
	private int num;

	public int getNum() {
		return num;
	}

	Model(int num) {

	}
}
