package oopsconcept;
class substract{
	static int sub(int a,int b) {return a-b;}
	static int sub(int a,int b,int c) {return a-b-c;}
	
}

public class Methodoverloading {

	public static void main(String[] args) {
		System.out.println(substract.sub(20, 10));
		System.out.println(substract.sub(500, 200, 200));
		

	}

}
