package Singleinhertance;
abstract class travell{
	abstract void ride();
	
}
class car extends travell{
	void ride() {System.out.println("car is safe for drive");}

}
 class bike extends travell{
	 void ride() {System.out.println("driving with out helemet is dangerous");}
 }
public class Abstractmethod {

	public static void main(String[] args) {
		travell v = new bike();
		travell t = new car();
		v.ride();
		t.ride();
		
		

	}

}
