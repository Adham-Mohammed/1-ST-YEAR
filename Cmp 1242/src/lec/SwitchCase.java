package lec;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("choose between: (Front-end web development, Back-end web development, Mobile development, Game developmen, Desktop applications, Systems programming)   ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine(); 
		switch(str) {
		case "Front-end web development":
			System.out.println("you can use JavaScript");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		case "Back-end web development":
			System.out.println("you can use JavaScript, Java, Python, PHP, Ruby");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		case "Mobile development":
			System.out.println("you can use Swift, Java, C#");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		case "Game developmen":
			System.out.println("you can use C++, C#");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		case "Desktop applications":
			System.out.println("you can use Java, C++, Python");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		case "Systems programming":
			System.out.println("you can use C, Rust");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("please choose from the given list");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		}
	}

}
