package firstproject;
//multiple inheritence using 2 interfaces

class fifteen implements Twelve,Thirteen{
	public void tech() 
	{
		System.out.println("executing tech method");
	}
}
public class Seventy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  fifteen obj=new fifteen();
     obj.tech();
	}

}
