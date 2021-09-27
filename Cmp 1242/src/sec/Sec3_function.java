package sec;

import java.util.Scanner;

public class Sec3_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		int n = takeInput();
//		processing
		String result = casting(n);
//		output
		System.out.println(result);
	}

	public static int takeInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
	public static String casting (int num) {
		String result;
		if (num%2==0) {
			if (num>20) {
				result="not weird";
		}
			else if (num>5) {
				result=" weird";

			}
				else {
					result="not weird";
				}
		}
		else {
			result="weird";

		}
		return result;	
	}
	}
