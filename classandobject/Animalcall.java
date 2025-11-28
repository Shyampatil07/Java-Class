package classandobject;

public class Animalcall {
	
	public static void main(String[] args) {
		
		Animal info = new Animal();
		
		 System.out.println("----- Animal Details -----");
	        System.out.println("Name: " +  (info.name = "Lion"));
	        System.out.println("Type: " + info.height);
	        System.out.println("Age: " + info.age);
	        System.out.println("Weight: " + info.weight );
	        System.out.println("Color: " + info.color);
	}

}
