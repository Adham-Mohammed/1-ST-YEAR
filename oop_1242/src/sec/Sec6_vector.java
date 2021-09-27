package sec;

public class Sec6_vector {
	int x;
	int y;
   private  double length; // Access modifier & get
 	public double getLength() {
		return length;
	}

//	public void setLength(double length) {  // this will allow to change the value of length
//		this.length = length;
//	}
	//Vector (){
		
	//}
	Sec6_vector (int x, int y){
		this.x=x;
		this.y=y;
		this.length = (Math.sqrt(x*x+y*y));
	}
	
	Sec6_vector addition(Sec6_vector v2) {
		//Vector reslut= new Vector();
		Sec6_vector reslut= new Sec6_vector(x, y);
		reslut.x=this.x + v2.x;
		reslut.y=this.y + v2.y;
		
		return reslut;
		
	}

	
	public String toString() {
		
		return this.x+" "+ this.y;
	}



	}


