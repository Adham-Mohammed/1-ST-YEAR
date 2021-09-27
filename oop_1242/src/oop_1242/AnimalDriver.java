package oop_1242;


	class Animal {
		int length=100;
		public void animalTrait() {
			System.out.println("Each animal has a good trait");
		}
//		public int animalTrait() {
//			return 1;
//		}
		public void animalUnique() {
			System.out.println("unique in Animal");
		}	
	}//end class

	class Cat extends Animal {
		int length=30;
		public void animalTrait() {
			System.out.println("The cat is cute");		
		}
		public void catUnique() {
			System.out.println("unique in CAt CAT");
		}
	}//end class

	class Dog extends Animal {
		int length=60;
		public void animalTrait() {
			System.out.println("The dog is loyal");
		}
	}//end class

	class Random extends Animal{
		
	}//end class
	class AnimalDriver{
		public static void main(String[] args) {
			Animal myAnimal = new Animal();
			Animal myCat = new Cat();//upcasting
			Animal myDog = new Dog();
			Animal myRand=new Random();
			Random myRand2=new Random();
			//Assigning a subclass reference to a superclass variable is safe
			//Cat cat=(Cat)(new Animal());
//			int k=cat.length;//cat
//			int k2=myCat.length;//animal
			myAnimal.animalTrait();
			myCat.animalTrait();//method exists in both classes, 
			//but the one being executed/invoked is within the Cat subclass
			myDog.animalTrait();
			myRand.animalTrait();
			myRand2.animalTrait();
			myCat.animalUnique();//method within the Animal superclass
			((Cat) myCat).catUnique();
			//((Cat)myCat).catUnique();//downcasting
			
			//Cat cat2=(Cat) new Animal();//ClassCastException
		
			//cat2 is an animal, not a cat
			//Variables are NOT polymorphic
			System.out.printf("Animal is %d %nCat is %d \n"
					+"Dog is %d \n", myAnimal.length, myCat.length, myDog.length);
			System.out.println("DownCasting");
			System.out.printf("Animal is %d %nCat is %d \n"
					+"Dog is %d \n", myAnimal.length, ((Cat)myCat).length, ((Dog)myDog).length);
		}//end main
	}//end class


