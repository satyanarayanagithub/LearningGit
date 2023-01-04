package Singleinhertance;
class adder{
	static int add(int a,int b) {return a+b;}
	static int add(int a,int b,int c) {return a+b+c;}
}

public class Methodoverloading {

	public static void main(String[] args) {
		System.out.println(adder.add(22,22));
		System.out.println(adder.add(100,200,300));

	}

}
