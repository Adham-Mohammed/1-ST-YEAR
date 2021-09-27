package lec;
 import java.util.Scanner;

public class Switchcase2 {
	
		public static void main(String[] args) throws InterruptedException { 
			// TODO Auto-generated method stub
			while(true) {
	            System.out.println("\nchoose between: (Front-end web development, Back-end web development, Mobile development, Game development, Desktop applications, Systems programming)   ");
	            Scanner sc= new Scanner(System.in);
	            String str=sc.nextLine(); 
	            
	            switch(str) {
	                case "Front-end web development":
	                    System.out.println("\nyou should learn: HTML/CSS, JavaScript");
	                    Thread.sleep(2000);
	                    break;
	                case "Back-end web development":
	                    System.out.println("\nyou should learn: HTML/CSS, JavaScript, Python, PHP, Ruby");
	                    Thread.sleep(2000);
	                    break;
	                case "Mobile development":
	                    System.out.println("\nyou should learn: Swift, Java, C#");
	                        Thread.sleep(2000);
	                    break;
	                case "Game development":
	                    System.out.println("\nyou should learn: C++, C#");
                        Thread.sleep(2000);
	                    break;
	                case "Desktop applications":
	                    System.out.println("\nyou should learn: Java, C++, Python");
	                        Thread.sleep(2000);
	                    break;
	                case "Systems programming":
	                    System.out.println("\nyou should learn: C, Rust");
	                    Thread.sleep(2000);
	                    break;
	                default:
	                    System.out.println("please choose from the given list");
	                    Thread.sleep(2000);
	                    break;
	            }
			 
			}

		}

	}
