package firstproject;
class twenty{
	public void ramu() {
		System.out.println("print ramu");
	}
}
class twentyone extends twenty{
	public void somu() {
		System.out.println("printing somu");
	}
}
class twentytwo extends twentyone{
	public void vamu() {
	System.out.println("printing vamu");
	}
}
class twentythree extends twentyone{
	public void monu() {
		System.out.println("printing nomu");
	}
}
class twentyfour extends twentyone{
	
}

public class Hybridinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    twentyfour obj=new twentyfour();
             obj.somu();
    
	}

}
