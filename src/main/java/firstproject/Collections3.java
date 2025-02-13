package firstproject;
// program for vector
import java.util.*;
public class Collections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector s=new Vector();
s.addElement("Kajaguda");
s.addElement("Mainkoda");
s.addElement("Shaikpet");
System.out.println(s);
s.removeElement("Shaikpet");
System.out.println(s);
System.out.println(s.get(1));

	}

}
