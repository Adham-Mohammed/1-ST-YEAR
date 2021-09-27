package oop_1242;

import java.util.Scanner;

import sec.Sec6_vector;

public class Bouns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the deposit amount: ");
		double ipDeposit = 0;
		while(true) {
		try { 
			ipDeposit=input.nextDouble();
		}
		catch(Exception e){
			System.out.println("Please enter the deposit amount: ");
			input.next();
			}
		
	finally {
		 
		System.out.printf("Anyways, a deposit amount of %f was made \n", ipDeposit);
		}
	System.out.println("");
		}
	
		

	}
}


