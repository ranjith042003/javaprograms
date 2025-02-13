package firstproject;
//treemap interface 
import java.util.*;
public class Collectiontreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map r=new TreeMap();
         r.put("R", "Ranga Reddy");
         r.put("H", "Hyderabad");
         r.put("A","Ameerpet");
         
       String rr=(String)r.get("R");
       System.out.println(r);
       System.out.println(rr);
       Integer b=new Integer(70);
       r.put("oo",b);
       System.out.println(r);
}



	}


