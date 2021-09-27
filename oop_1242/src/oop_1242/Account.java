package oop_1242;
// CamalCase: UserName"class name", CamalCase2: userName "variable name, method"

public class Account { // access modifier
	private String name ; // instance var " which happen first cons " vs local var 
	private double balance;
	
	public void setName(String userName) {
		name = userName;// if arg list has a name
	}
	
	public String getName() {
	return name; // call the name

        }
	// lec 7`
	public Account (String userName, double balance) {
		name = userName;
		if(balance>=0) {
			this.balance= balance;
			}
	}
	
	
	public void deposit (double amount) {
		if (amount>0) {
			balance=balance+amount;
		}
	}	
		public double getBalance() {
			return balance;
		}
		
 }

