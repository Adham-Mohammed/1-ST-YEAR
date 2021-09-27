package sec;

public class Cat {
	String color;
	String name;
	int age;
	
	
	Cat(){
		this.Meao();
	}
	
	Cat( String color , String name ,int age) {
		this.color = color;
		this.name = name;
		this.age = age;
		this.Meao();
	}
	void Meao () {
		System.out.println("meao "+ name +" "+ age);
	}

}
