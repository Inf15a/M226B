package ch.lu.bbzw.kapitel1;

public class Employee {
	private int employeeNr;
	private String name;
	private double salary;

	public Employee() {
		this(0, null, 0.0);
	}

	public Employee(int employeeNr, String name, double salary) {
		this.employeeNr = employeeNr;
		this.name = name;
		this.salary = salary;

	}

	public double getAnniversarySalary() {
		return 12 * salary;
	}

	public int getEmployeeNr() {
		return employeeNr;
	}

	public void setEmployeeNr(int employeeNr) {
		this.employeeNr = employeeNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
