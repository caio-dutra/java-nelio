package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double rateOfChange = percentage / 100;
		double multiFactor = 1 + rateOfChange;
		grossSalary *= multiFactor;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		}

}
