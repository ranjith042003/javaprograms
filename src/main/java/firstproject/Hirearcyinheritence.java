package firstproject;
 class oone {
	 public void sit() {
		 System.out.println("printing one ");
	 }
 }
	 class twoo extends oone{
		 public void stand() { 
		 
		 System.out.println("printing two from one");
		 }
	 }
		 class threee extends oone{
			 public void bend() {
				 System.out.println("printing three from one");
			 }
			 }
			 class fourr extends oone{
			 
			 }

public class Hirearcyinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          fourr obj= new fourr();
          obj.sit();
	}
}


