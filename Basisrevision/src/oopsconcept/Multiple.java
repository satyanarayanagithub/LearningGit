package oopsconcept;
interface  chair{
 void print();
}
interface table{
	void shown();
	
}
class A10 implements chair,table{
	public void print() {System.out.println("it is used to sit");}
	public void shown() {System.out.println("it is used for reading");}
	
}

public class Multiple {

	public static void main(String[] args) {
		A10 u = new A10();
		
		u.print();
		u.shown();
	}

}
