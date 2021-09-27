package sec;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word ");
		String word = sc.nextLine();
//		char[] ch = word.toCharArray();
//		System.out.println(ch);
		Thread.sleep(800);
		System.out.println("strat!");
		for(int i=0; i<word.length(); i++) {
			System.out.print(" ___ ");
		}
		System.out.println();
		System.out.println("choose a letter:");
		for(int i=0; i<word.length()+2; i++) {
			char ch = sc.next().charAt(0);
		if(word.indexOf(ch)!=-1)
		{
		   System.out.println("ture");
		}
		else
		{
		   System.out.println("false");
		}
		System.out.println("choose again:");
		
		
		


	}
	}
}
