package Singleinhertance;


class teacher {
	int bonous = 5000;
}

public class Revisionsingleinheritance extends teacher {
		int salary = 20000;

	
	public static void main(String[] args) {
		Revisionsingleinheritance t = new Revisionsingleinheritance();
		System.out.println(t.bonous);
		System.out.println(t.salary);
		

	}

}
