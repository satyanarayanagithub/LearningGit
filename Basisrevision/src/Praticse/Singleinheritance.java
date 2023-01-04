package Praticse;
class vechicle{
	String name = "shine";
	int price = 100000;
	
	
}

public class Singleinheritance extends vechicle {
	String Bike = "glammour";
	int Amount = 75000;
	

	public static void main(String[] args) {
		Singleinheritance s = new Singleinheritance();
	System.out.println(s.name);
	System.out.println(s.price);
	System.out.println(s.Bike);
	System.out.println(s.Amount);

	}

}
