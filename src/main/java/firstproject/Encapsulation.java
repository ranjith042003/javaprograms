package firstproject;

class Encap 
{
  int rs=99;
  public void how()
  {
	  
	  rs--;
	  System.out.println("decrement value is:"+rs);
  }
}
public class Encapsulation  {
	public static void main(String args[]) {
		Encap job=new Encap();
		System.out.println(job.rs);
		job.how();
		
	}
	
	
}
