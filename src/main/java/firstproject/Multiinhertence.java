package firstproject;
class one{
	public void prakash() {
		System.out.println("printing 1st line");
		}
	}
	class two extends one{
		public void charan() {
			System.out.println("printing 2nd line");
		}
		}
	class three extends two{
		public void ranjith() {
			System.out.println("printing 3rd line");
		}
		}
		class four extends three{
			
		}

public class Multiinhertence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        four obj= new four();
         obj.charan();
         one obj1=new one();
         obj1.prakash();
	}

}
