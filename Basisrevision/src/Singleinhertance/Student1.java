package Singleinhertance;

public class Student1 {
	String name;
	int id;
	float fees;
	Student1(String name,int id,float fees){
		this.name = name;
		this.id =id;
		this.fees = fees;
		
}
	void display2(){System.out.println(name+" "+id+" "+fees);}
	
	// Create method with no return & no argument
	public void m1() {
		System.out.println("Method1");
	}
	// Create method with return & argument
	public String m2(String name) {
		System.out.println("Method2");
		return name;
	}
	
	static void m3(int a, int b) {
		
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		Student1 s = new Student1( "ravi",500,10000);
		Student1 d = new Student1("satya",600,20000);
		
		s.display2();
		d.display2();
		
	String name = "satya";
	int number = 10;
	float no = 11;
	boolean retur = true;
	
	s.m1();
	String sto = s.m2("BBK");
	System.out.println(s.m2("Satya"));
	System.out.println(sto);
	m3(5,10);
	
	

	}

}

