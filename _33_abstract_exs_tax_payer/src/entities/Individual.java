package entities;

public class Individual extends PayTaxer {
	
	private Double healthExpenses;
	
	public Individual() {
	}

	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {
		if (getAnnualIncome() < 20000.00) {
			return getAnnualIncome() * 0.15 - (healthExpenses/2);
		} else {
			return getAnnualIncome() * 0.25 - (healthExpenses/2);
		}		
	}

	@Override
	public String toString() {
		return getName() 
				+ ": $ "
				+ String.format("%.2f", tax());
	}
	
	

}
