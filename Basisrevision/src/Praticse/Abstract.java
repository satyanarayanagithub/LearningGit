package Praticse;
abstract class cycle{
abstract void rid();
	}
class motorcycle extends cycle{
	 void rid() {System.out.println("it move more speed than cycle");}
	 }
class bullet extends cycle{
	void rid() {System.out.println("it move more speed than bullet ");}
	}
public class Abstract {

public static void main(String[] args) {
		cycle c = new bullet();
		cycle k = new motorcycle();
		c.rid();
		k.rid();
	}
		
	}


