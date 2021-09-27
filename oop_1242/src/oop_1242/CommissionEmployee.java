package oop_1242;
    // lec 8
public class CommissionEmployee {

	 private final String firstName;
	 private final String lastName;
	 private final String socialSecurityNumber;
	 private double grossSales;
	 private double commissionRate;
	 
	 public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			 double grossSales, double commissionRate ) {
		 
		 if (grossSales<0.0) {
			 throw new IllegalAccessException("gross sales must be >0");
		 }
		 
		 if (commissionRate<0.0 || commissionRate>= 1.0) {
			 throw new IllegalAccessException("commission Rate must be > 0.0 and  < 1.0");
		 }
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.socialSecurityNumber=socialSecurityNumber;
		 this.setGrossSales(grossSales);
		 this.setCommissionRate(commissionRate);
	 }

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		 if (grossSales<0.0) { // exception and handling in the main
			 throw new IllegalAccessException("gross sales must be >0");
		 }
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		 if (commissionRate<0.0 || commissionRate>= 1.0) {
			 throw new IllegalAccessException("commission Rate must be > 0.0 and  < 1.0");
		 }
		this.commissionRate = commissionRate;
	}
	 public double earnings() {
		 return getCommissionRate()* getGrossSales(); 
	 }
	 
	 public void TOSTRING1(){	 
		 
	 }
	// 
	@Override // this national is optional
	 // overriding :change the implementation of the super class method
	 // @override: check the method signature
	 // method signature: return + name + parameterlist
	 
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", null);
		
	}

}
