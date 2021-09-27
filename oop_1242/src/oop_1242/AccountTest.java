package oop_1242;

import java.util.Scanner;

public class AccountTest {
	// drive class "the main class which have GUI"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//Account myAccount = new Account("adham", 1000); // instance class\object // Account() account of void "the constructor"
		//  public Account( blank or arg){ // no retrun // constructor form 
		// dispaly initial value of name= (null)
		//System.out.printf("the initial name=%s%n%n", myAccount.getName());
		// create an Account object and assign it to myAccount
		// promp for and read
//		System.out.println("plz,Enter your name:");
//		String theName = sc.next();
//		myAccount.setName(theName);
//		System.out.println();
//		sc.close();
		
//		 lec 7
		 Account acc1= new Account("john", 32);
		 Account acc2= new Account("mariam", -15);
		 System.out.println(acc1.getBalance());
		 System.out.println(acc2.getBalance());
		 System.out.println("please enter the deposit amount for acc1");
		 double ipdeposit= sc.nextDouble();
		 acc1.deposit(ipdeposit);
		 System.out.printf("\n %s owns %.2f \n",acc1.getName(),acc1.getBalance());
		 Account[] accll =new Account[2];
		 accll[0]= new Account("zero", 3.5);
		 accll[1]= new Account("one", 32);
		 for (int i = 0; i<2; i++) 
			 System.out.printf("\n %s owns %.2f \n",accll[i].getName(),accll[i].getBalance());
		 
		 
		
		Boolean boo = true;
		while (boo) {
			System.out.println("please enter the deposit amount :");
			try {
			 
			 ipdeposit = sc.nextDouble();
			 boo= false;
		 }
		 catch(Exception e) {
			 System.out.println("invaled input");
			 sc.next();
		 }
		 
		}
		
//		 finally { // will always happen
//			 System.out.println("anyways, a deposit of amount "+ipdeposit+"was made");
//		 }
			 
		 
		 
		sc.close();

	}

}
