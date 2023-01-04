package Singleinhertance;
class Employee{
	void fees(){System.out.println(12000);}
	
	
}
class driver extends Employee {
	void salary(){System.out.println(15000);}
	
}

public class Heriracalinheritance extends Employee {
	void bus(){System.out.println(19000);}
	
	public static void main(String[] args) {
		Heriracalinheritance h = new Heriracalinheritance();
		h.fees();
		h.bus();
		
		
		
		
		
	}

}
