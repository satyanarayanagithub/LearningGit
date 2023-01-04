package oopsconcept;
class Circle{
	String shape = "round";
	
}
class rectangle extends Circle{
	int Length = 5;
	
}



public class Heriracalinheritance extends Circle {
 int line = 10;
	public static void main(String[] args) {
		Heriracalinheritance h = new Heriracalinheritance();
		System.out.println(h.shape);
		System.out.println(h.line);

	}

}
