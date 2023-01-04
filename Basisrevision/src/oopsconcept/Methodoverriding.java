package oopsconcept;
class horse{
	void run() {System.out.println("Horse is used for riding");}
}

public class Methodoverriding extends horse{
	
	void run() {System.out.println("Method Overriding");}
	

	public static void main(String[] args) {
		Methodoverriding l = new Methodoverriding();
		l.run();
	}

}
