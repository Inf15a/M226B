package ch.lu.bbzw.kapitel1;

public class Manager extends Employee {

	private double bonus;
	private boolean goal;

	public Manager(int employeeNr, String name, double salary, double bonus) {
		super(employeeNr, name, salary);
		this.setBonus(bonus);
	}

	public boolean isGoal() {
		return goal;
	}

	public void setGoal(boolean goal) {
		this.goal = goal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getAnniversarySalary() {
		return super.getAnniversarySalary();
	}

}
