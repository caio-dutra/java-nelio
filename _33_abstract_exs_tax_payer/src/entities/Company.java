package entities;

public class Company extends PayTaxer {
	
	private Integer numberEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		if (numberEmployees > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() + 0.16;
		}
	}
	
	@Override
	public String toString() {
		return getName() 
				+ ": $ "
				+ String.format("%.2f", tax());
	}

}
