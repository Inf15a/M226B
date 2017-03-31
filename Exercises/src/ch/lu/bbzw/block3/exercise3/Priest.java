package ch.lu.bbzw.block3.exercise3;

public class Priest extends Person {
	public Priest(String name, String prename) {
		super(name, prename);
	}

	@Override
	public String typ() {
		return super.typ() + " ein Pfarrer";
	}

}
