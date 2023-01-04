package Singleinhertance;

public class constructor {
	String name;
	int id;
	constructor(int i,String n){
		id = i;
		name = n;
		
	}
void display() {System.out.println(name+""+id);}
	public static void main(String[] args) {
		constructor c = new constructor(123,"satya");
		constructor e = new constructor(999,"narayana");
		c.display();
		e.display();
		

	}

}
