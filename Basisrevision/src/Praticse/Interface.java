package Praticse;
interface circle{
	void draw();
}
class rectangle implements circle{
   public void draw() {System.out.println("The rect is length and breath");}
}
 class square implements circle{
	 public void draw() {System.out.println("The length and breath are equal");}
	 
 }
public class Interface {

	public static void main(String[] args) {
		square s = new square();	
		s.draw();

	}

}
