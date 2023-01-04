package oopsconcept;
abstract class bag{
	abstract void carry();
}
class travellbags extends bag{
	void carry() {System.out.println( "this have more space");}
	}
class laptopbags extends bag{
	void carry() {System.out.println( "this have less space");}
		
	}

public class AbstractMethod {

	public static void main(String[] args) {
		bag a = new laptopbags();
		bag k = new travellbags();
		a.carry();
		k.carry();
		
		
	}
		

	}


