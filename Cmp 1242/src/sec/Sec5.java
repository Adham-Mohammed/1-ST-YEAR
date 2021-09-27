package sec;

public class Sec5 {
//	public static void main(String[] args) {
//		char x = 97;
//		char reslut= (char) (x+1); // casting
//		System.out.println(reslut);
//		System.out.println(x+1);
//		System.out.println(x+""+1);
//		// 
//		String s = "SDASDdssa";
//		System.out.println(s.toLowerCase());
//	
//		System.out.println(StringToLowerCase(s));
//	}
//	public static String StringToLowerCase(String s) {
//		String reslut="";
//		for (char x:s.toCharArray()) {
//			if (x>='A' && x<='Z') {
//				reslut += (char) (x +'a'-'A');
//			} else {
//				reslut += x ;
//			}
//		}
//		
//		return reslut;
//	}
	//
//	public static void main(String[] args) {
//		for (int i=0; i<10; i++) {
//			System.out.print(i);
//			if (i==5) break;
//			if (i==2) continue;
//		}
//		System.out.println("");
//		print(0);	
//	}
//	// recursion used as loop 
//	public static void  print(int i) {
//		if (i>=10) return ;
//		if (i==5) return ; // break
//		if (i==2) i=i+1; // continue
//		System.out.print(i);
//		print(i+1);
//		
//	}
	public static void main(String[] args) {
		int total =0;
		for (int i=0; i<10; i++) {
			total +=i;
		}
		System.out.println(total);
		System.out.println(sum(0,0));
	}
	public static int sum(int i, int total) {
		if (i>=10) return total;
		return sum(i+1, total+i);
		
	}

	
	

}
