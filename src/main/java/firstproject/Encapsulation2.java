package firstproject;
class our{
	int aa=500;
	int bb=100;
	public void tech() {
		aa++;
		System.out.println("the value is"+aa);
	}
	public int sap() {
		--bb;	
		return bb;
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		our abc=new our();
		System.out.println(abc.aa);
		int re=abc.sap();
		System.out.println(re);
	}

}
