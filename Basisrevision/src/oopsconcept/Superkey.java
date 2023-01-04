package oopsconcept;
class bird{
	String colour = "white";
	int id = 15;
	
	void supermethod() {
		System.out.println("Super Method");
	}
	
	bird(){
		System.out.println("Parent Class Constructor");
	}
	
}

public class Superkey extends bird{
	String colour = "black";
	int id = 25;
	
	void display() {System.out.println(colour+" "+id);}
	void superm() {
        // super.supermethod();
		 System.out.println( super.colour+" "+super.id);
         super.supermethod();
		 display();
	}
	
	Superkey(){
		
	System.out.println("Child Class Constructor");
	
	}
	int addition(int a,int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		Superkey s = new Superkey();
		//s.display();
		s.superm();
        int ret = s.addition(5, 16);
        System.out.println(ret);
		

	}

}
