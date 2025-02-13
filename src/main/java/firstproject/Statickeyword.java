package firstproject;
//static keyword
class ten{
	static int a=10;
	static public void sun() {
		System.out.println("executing sun method");
	}
}

public class Statickeyword {
	static {
		System.out.println("executing static keyword");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(ten.a);
	}

}
