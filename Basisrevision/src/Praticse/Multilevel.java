package Praticse;
class school{
	int schfees = 20000;
	int buscharge = 15000;
	
	
}
class tution extends school{
	int tutcharge = 20000;
}

public class Multilevel extends tution {
	
	int examfee =20000;
	
	

	public static void main(String[] args) {
		Multilevel m = new Multilevel();

		System.out.println(m.schfees);
		System.out.println(m.buscharge);
		System.out.println(m.tutcharge);
		System.out.println(m.examfee);
	

	}

}
