package Praticse;
class colour{
	String name ="The rose is red";
	int price = 20;
	
}
class size extends colour{
	int amount = 15;
}

public class Herirarical extends colour {
	String height = "The camel has long neck";
	String weight = "Eleghapant is more weigh";
	

	public static void main(String[] args) {
		Herirarical h = new Herirarical();
		System.out.println(h.name);
		System.out.println(h.price);
		System.out.println(h.height);
		System.out.println(h.weight);
		

	}

}
