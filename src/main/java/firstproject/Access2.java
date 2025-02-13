package firstproject;
//protected accessmodifiers
import raidurg.*;
 class second extends First{
	 public void ran() {
		 super.hell();
		 System.out.println("it will print ran");
	 }
 }
 public class Access2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           second obj=new second();
           obj.ran();
	}

}
