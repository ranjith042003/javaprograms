package firstproject;
// private access modifiers
 class onedy{
	 
	 private int b=10;
	 public void sample() {
		 System.out.println("the value of b:"+b);
	 }
	 
 }

public class Accessmodifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onedy obj=new onedy();
		obj.sample();

	}

}
