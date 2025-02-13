package firstproject;
//linkedlist program
import java.util.*;

	
public class Linkedlistcollections extends LinkedList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlistcollections w=new Linkedlistcollections();
w.addFirst("java");
w.addFirst("python");
//System.out.println(w);
w.addLast("Testing");
w.addLast("Selenium");
//System.out.println(w);
String e=(String)w.getFirst();
//System.out.println(e);
String ee=(String)w.getLast();
//System.out.println(ee);
w.removeFirst();
//System.out.println(w);
w.removeLast();
System.out.println(w);
}
}

