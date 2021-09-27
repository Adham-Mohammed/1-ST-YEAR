package sec;

public class Sec6_vector_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sec6_vector v1 = new Sec6_vector(5, 10);
		Sec6_vector v2 = new Sec6_vector(2, 4);
		Sec6_vector v3 = v1.addition(v2);
		System.out.println(v3.x+" "+v3.y );
		System.out.println(v3); // need toString
//		v1.length=2;
		System.out.println(v1.getLength());
		

	

	}

}
