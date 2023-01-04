package Praticse;
class transport{
	void run() {System.out.println("Bike runs with petrol");}
}

public class Methodoverriding extends transport {
	void run() {System.out.println("car is runs with diseal");}



	public static void main(String[] args) {
		Methodoverriding m = new Methodoverriding();
		
		m.run();
	}
		
	}
	
		

	


