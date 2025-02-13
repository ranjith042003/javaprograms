package firstproject;
class first{
 int a=20;
 public void mec() 
 {
	 System.out.println("printing");
 }
 class  second extends first
 {
	
 }
  
}

public class Singleinhertinance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       first obj=new first();
       System.out.println(obj.a);
       obj.mec();
      
	}

}
