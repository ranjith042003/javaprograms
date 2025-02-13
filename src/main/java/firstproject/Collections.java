package firstproject;
// to store different datatype values
import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList t=new ArrayList();
   t.add("Telangana");
   t.add("Hyderabad");
   System.out.println(t);
   
  t.remove(0); 
  System.out.println(t);
  
   System.out.println(t.get(0));
	}

}
