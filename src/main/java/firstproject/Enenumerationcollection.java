package firstproject;
import java.util.*;

public class Enenumerationcollection extends Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Vector f=new Vector();
               f.addElement("1");
               f.addElement("2");
               f.addElement("3");
               f.addElement("4");
               Enumeration gg=f.elements();
               int i=0;
               while(gg.hasMoreElements())
               {
            	   Object b=gg.nextElement();
            	   System.out.println("No.is"+""+1);
               }
	}

}
