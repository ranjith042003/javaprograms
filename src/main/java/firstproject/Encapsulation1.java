package firstproject;
class roast{
	int R=800;
	int s=650;
	public void suu() {
		R++;
		System.out.println(R);
	}
	public void ash() {
		--s;
		System.out.println(s);
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
roast obj=new roast();
System.out.println(obj.R+"\t"+obj.s);
obj.suu();
roast obj1=new roast();
System.out.println(obj1.R+"\t"+obj1.s);
obj1.ash();
	}

}
