package firstproject;
//scanner class program
import java.util.*;
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter your name");
  Scanner obj=new Scanner(System.in);
  String name=obj.nextLine();
  System.out.println("Enter your Id");
  int id=obj.nextInt();
 System.out.println("Enter your salary");
 float salary=obj.nextFloat();
 System.out.println("your name is"+name);
 System.out.println("your id is"+id);
 System.out.println("your salary is"+salary);
	}

}
