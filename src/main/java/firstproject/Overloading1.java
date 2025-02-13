package firstproject;
//changing data data type  sequence
class tennhundred{
	float r;
	int d;
	public void yellow(float r1,int d1) {
		r=r1;
		d=d1;
		System.out.println(r+"\t"+d);
	}
	public void yellow(int d1,float r1) {
		d=d1;
		r=r1;
		System.out.println(d+"\t"+r);
		
	}
}

public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tennhundred obj=new tennhundred();
		obj.yellow(25,30.5f);
	}

}
