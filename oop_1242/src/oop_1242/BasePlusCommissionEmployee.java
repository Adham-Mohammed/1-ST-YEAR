package oop_1242;
   // lec 8
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		// this the super class
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary<0.0) {
			 throw new IllegalAccessException("base salary must be >0");
		 }
		this.baseSalary = baseSalary;
	}
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}

}
