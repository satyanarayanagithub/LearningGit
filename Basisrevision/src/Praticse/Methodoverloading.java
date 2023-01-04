package Praticse;
class divded{
	static int divd(int a,int b) {return a/b;}
	static int divd(int a,int b,int c) {return a/b/c;}
}

	


public class Methodoverloading {

	public static void main(String[] args) {
		System.out.println(divded.divd(4, 2));
		System.out.println(divded.divd(12, 9, 3));
		//Change
		

	}

}

