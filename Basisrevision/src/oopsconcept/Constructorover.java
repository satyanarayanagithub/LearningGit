package oopsconcept;

	
public class Constructorover {
	
		int id;
		String name;
		int rollno;

		Constructorover(int i,String n,int r){
		id = i;
		name =n;
		rollno=r;
	}
		
	void display() {System.out.println(id+" "+name+" "+rollno);}
public static void main(String[] args) {
	Constructorover m = new Constructorover(111,"ramu",01);
	Constructorover j = new Constructorover(222,"raju",02);
	m.display();
	j.display();
}

}






