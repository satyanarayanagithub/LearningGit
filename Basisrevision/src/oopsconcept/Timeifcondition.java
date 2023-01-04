package oopsconcept;

public class Timeifcondition {
	
	 int a =90;
	 int b = 80;
	 static int c = 70;
	 static int d = 60;
	 
	 
	 void n1() {
		 
		  System.out.println(a+c);
		
		  System.out.println(b+c);
			System.out.println(Timeifcondition.c+a);
			System.out.println(Timeifcondition.d+a);
	}
			
			static void n2() {
				
				System.out.println(Timeifcondition.c);
				System.out.println(Timeifcondition.d);
				
				Timeifcondition t2 = new Timeifcondition();
				
				
				System.out.println(t2.a);
				System.out.println(t2.b);
			}
	
public static void main(String[] args) {
	
	Timeifcondition.n2();
	Timeifcondition m = new Timeifcondition();
	m.n1();
	
}
}
