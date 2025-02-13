package firstproject;
//arraylistiteration class
import java.util.*;
import java.util.ListIterator;

public class Collectionlistiterationinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<String> row=new  ArrayList<String>();
           row.add("one");
           row.add("Two");
           row.add("Three");
           row.add("Four");
           row.add("Five");
           ListIterator<String> iterator= row.listIterator();

           System.out.println("Forward Direction Iteration:");

           while (iterator.hasNext())
           {

           String aa =iterator.next();

           System.out.println(aa);
           }

           System.out.println("Backward Direction Iteration:");

           while (iterator.hasPrevious())

           { 
        	   String s= iterator.previous();
           
           System.out.println(s);
	}
	}
}
