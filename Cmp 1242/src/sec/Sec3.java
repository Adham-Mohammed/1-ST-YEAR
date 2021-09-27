package sec;

import java.util.Scanner;

public class Sec3 {

	public static void main(String[] args) {
//		input
		int n = takeInput();
//		processing
		String result = casting(n);
//		output
		System.out.println(result);
	}
//	<access modifiers> <return type> <function name>  { <argucants>} {   //  made a function
//		body
//	}
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
	
	
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//int numb_case=sc.nextInt();
//for(int i=0; i<numb_case; i++) { // number of case
//	int num = sc.nextInt();
//	if (num%2==0) {
//		if (num>20) {
//			System.out.println("not weird");
//	}
//		else if (num>5) {
//			System.out.println("weird");
//		}
//			else {
//			System.out.println("not weird");
//			}
//	}
//	else {
//		System.out.println("weird");
//	}
	
		
	
////		for(String s:args) { // for each
//////			we want to do dubg
////				int num = Integer.parseInt(s); // casting change form string to int
////				String h = Integer.toString(5); // casting change form  int to string
////				if (num%2==0) {
////					if (num>20) {
////						System.out.println("not weird");
////				}
////					else if (num>5) {
////						System.out.println("weird");
////					}
////		 			else {
////		 			System.out.println("not weird");
////		 			}
////				}
////				else {
////					System.out.println("weird");
//				
//		}
//		}
//		}



