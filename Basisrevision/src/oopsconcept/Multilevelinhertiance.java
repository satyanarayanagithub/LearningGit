package oopsconcept;
class student{
	int schoolfees = 10000;
	
}
class travell extends student{
	int transportfees = 7000;
	
}

public class Multilevelinhertiance extends travell {
	int privatefees = 5000;

	public static void main(String[] args) {
		Multilevelinhertiance m = new Multilevelinhertiance();
		 
		System.out.println(m.schoolfees);
		System.out.println(m.transportfees);
		System.out.println(m.privatefees);
		
	}

}
