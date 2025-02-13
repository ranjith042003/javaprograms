package firstproject;

 abstract class sixtynine
 {
	abstract public void meerpet(); 
}
 class fourtwenty extends sixtynine{
	 public void meerpet() {
		 System.out.println("executing pros method");
	 }
 }

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fourtwenty obj=new fourtwenty();
          obj.meerpet();
	}

}
