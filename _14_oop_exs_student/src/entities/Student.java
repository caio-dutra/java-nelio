package entities;

public class Student {
	
	public String name;
	public double trimester1;
	public double trimester2;
	public double trimester3;
	
	
	
	public double finalGrade() {
		return trimester1 + trimester2 + trimester3;
	}
	
	public String toString() {
		double missing = 60 - finalGrade();
		if (finalGrade() >= 60) {
			return String.format("FINAL GRADE: %.2f\nPASS", finalGrade());
		} else { 
			return String.format("FINAL GRADE: %.2f\nFAILED", finalGrade())
					+ String.format("\nMISSING %.2f POINTS", missing);
		}
	}
	
	
}
