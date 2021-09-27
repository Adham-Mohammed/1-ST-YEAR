package sec;

import java.util.Scanner;

public class Sec4_ispalinder {
	public static boolean isPalindroms(String word) {
		boolean ispa= true ; 
		if (word.isEmpty()) {
			ispa=true;
		}
		 for(int i=0; i< word.length(); i++) {
			int num = word.length()-(i+1);
			 if (word.charAt(i)!=word.charAt(num)) {
				 ispa=false;
				 break; 
			 }
			
		 }
		return ispa;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true){
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the word");
		 String str =sc.nextLine();
		 boolean b = isPalindroms(str);
		 String result = String.format("the word is %b", b);
			System.out.println(result);
	}
	}
			
			
		    
		 
			 

		   }


