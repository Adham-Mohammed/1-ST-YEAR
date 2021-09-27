import java.util.Scanner;



 public class Final  {
	
	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount("Ahmed", 2000F);
		System.out.println(bankAccount);
			
			
			
	}
}

class BankAccount{
	String holderName;
	float balance;
	public BankAccount(String holderName, float balance){
	this.holderName = holderName;
	this.balance = balance;
	}
}
