package oopsconcept;
class vechicle{
	String bike = "hondashine";
	
}

public class Singleinheritance extends vechicle {
	int price = 100000;
	

	public static void main(String[] args) {
		Singleinheritance h = new Singleinheritance();
		System.out.println(h.bike);
		System.out.println(h.price);
		
		
		
	}

}
