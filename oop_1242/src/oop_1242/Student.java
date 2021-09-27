package oop_1242;   // lec 7

public class Student {
	// overloading
	Student() {
		System.out.println("hello !!");
		
	}
	Student(int x) {
		this(); // counstuctor chain
		System.out.println(x);
	}
	int rollno;
	String name, course;
	float fee;
	Student(int rollno, String name, String course){
		this.rollno=rollno;
		this.course=course;
		this.name=name;
	}
	Student(int rollno, String name, String course, float fee){
		this(rollno, name, course );// reusing constructor //this constructor must be first line 
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+course+" "+name+" "+fee);
		
	}
	public static void main(String[] args) {
		Student s0= new Student();
		Student s1= new Student(111, "Ahmed", "java");
		Student s2= new Student(111, "Ahmed", "java", 6000f);
		s0.display();
		s1.display();
		s2.display();
		Student a = new Student(10);
		Student b = new Student(10);
		// a and b equal in value but different in reference
		Student c=a; // have the same reference 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	
	}
}
 
 

	
	