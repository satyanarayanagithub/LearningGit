package Singleinhertance;
interface cycle{
	void ride();
	default void run() {System.out.println("Running is much more better");}
}
class flight implements cycle{
	public void ride() {System.out.println("flight moves faster than cycle");}
	
}
 class bus implements cycle{
	 public void ride() {System.out.println("bus moves faster than cycle");}
	 
 }
public class Interfacemethod {

	public static void main(String[] args) {
		flight  c = new flight();
		new bus().ride();
		new bus().run();
		
		
		c.ride();
		c.run();
		
				
	}

}
