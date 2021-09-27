package sec;

import java.util.Scanner;

public class Sec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		int numb_case=sc.nextInt();
		for(int i=0; i<numb_case; i++) {
			int num = sc.nextInt();
			if (num%2==0) {
				if (num>20) {
					System.out.println("not weird");
			}
				else if (num>5) {
					System.out.println("weird");
				}
	 			else {
	 			System.out.println("not weird");
	 			}
			}
			else {
				System.out.println("weird");
			}
		}
		
	
		
//		ex:1
//		int i= 1;
//		while(i==1) {
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner(System.in);
//		double num = sc.nextDouble();
//		if (num>0) {
//		System.out.println("positive");
//		}
//		else if (num==0) {
//			System.out.println("number is zero");
//		}
//		else {
//			System.out.println("negative");
//			}
//		}
//	}
//		ex:2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("a=");
//		double a = sc.nextDouble();
//		System.out.println("b=");
//		double b = sc.nextDouble();
//		System.out.println("c=");
//		double c = sc.nextDouble();
//		double root_part= b*b-4.0*a*c;
//		if(b*b-4.0*a*c>0 ) {
//			double r1 = (-b + Math.pow(root_part, 0.5)) / (2.0*a);
//			double r2 = (-b - Math.pow(root_part, 0.5)) / (2.0*a);
//			System.out.println("the roots are "+r1+"and "+r2);
//		}else if (b*b-4.0*a*c==0) {
//			double r = -b/2.0*a;
//			System.out.println("the root is "+r);
//			
//			} else {
//				System.out.println("the equition has no real roots");
//			
//		}
//		ex:3
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the first number");
//		double num1= sc.nextDouble();
//		System.out.println("Enter the second number");
//		double num2= sc.nextDouble();
//		System.out.println("Enter the third number");
//		double num3= sc.nextDouble();
//		if (num1>num2 ) {
//			if (num1>num3) {
//				System.out.println("the greatest number is "+num1);
//			}
//			else {
//				System.out.println("the greatest number is "+num3);
//			}
//			
//		}
//		else if (num2>num3) {
//			System.out.println("the greatest number is "+num2);
//		} else {
//			System.out.println("the greatest number is "+num3);
//		}
//		to get random number between0,100
//		int i=1;
//		while(i<100) {
//		int num =(int)(Math.random()*101);
//		System.out.println(num);
//		i=i+1;
//		}
		
			
			
	}
}
