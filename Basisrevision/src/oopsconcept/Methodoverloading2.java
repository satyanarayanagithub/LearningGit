package oopsconcept;
class adder{
	static int add(int a,int b,int c ) {return a+b+c;}
	static int divd(int a, int b) {return a/b;}
	
}

public class Methodoverloading2 {

	public static void main(String[] args) {
		System.out.println(adder.add(20, 30, 10));
		System.out.println(adder.divd(4, 2));
		
		
	}

}
