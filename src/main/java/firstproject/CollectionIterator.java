package firstproject;
//Iteration interface
import java.util.*;
public class CollectionIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ArrayList f=new ArrayList();
               f.add("1");
               f.add("2");
               f.add("3");
               f.add("5");
               System.out.println(f);
               Iterator g=f.iterator();
               int d=0;
               while(g.hasNext())
               {
            	   Object j=g.next();
            	   if(d==2)
            	   {
            		   g.remove();
            		   System.out.println("removed");
            		   
            	   }
            	   d++;
            	   System.out.println(f);
               }
	}

}
