package ch.lu.bbzw.block3.exercise3;

public class Person {
	private String name;
	private String prename;

	public Person(String name, String prename) {
		this.name = name;
		this.prename = prename;
	}

	public String typ() {
		return "Ich bin " + name + " " + prename;
	}

	public void Ausgabe() {
		System.out.println(typ());
	}
}
