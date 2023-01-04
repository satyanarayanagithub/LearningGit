package Singleinhertance;
class student{
	int fees = 10000;
	
}
class book extends student{
	int schoolfees = 30000;
	
}
public class Singleinheritancetwo extends book {
	int busfees = 5000;

	public static void main(String[] args) {
		
		Singleinheritancetwo s = new Singleinheritancetwo();
		 System.out.println(s.fees);
		 System.out.println(s.busfees);
		 System.out.println(s.schoolfees);
		

	}

}
