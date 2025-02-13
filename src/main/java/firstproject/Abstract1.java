package firstproject;
abstract class cmr{
	abstract public void malla();
	public void show() {
		System.out.println("executing show method");
	}
}
	class cherry extends cmr{
		public void malla() {
			System.out.println("executing malla method");
		}
	}


public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         cherry obj= new cherry();
         obj.malla();
         obj.show();
	}

}
