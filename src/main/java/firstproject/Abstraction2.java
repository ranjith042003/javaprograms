package firstproject;
// two abstract methods
abstract class dsa{
	abstract public void pet();
	abstract public void tep();
}
 class klm extends dsa{
	 public void pet() {
		 System.out.println("executing pet method");
	 }
	 public void tep() {
		 System.out.println("executing tep method");
	 }
 }
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 klm obj=new klm();
   obj.pet();
   obj.tep();
	}

}
