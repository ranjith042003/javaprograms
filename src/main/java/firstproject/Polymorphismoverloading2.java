package firstproject;
//method overloading by changing datatypes
class fourhundred{
	char e;
	String d;
	public void wow(char e1) {
		e=e1;
	
		
		System.out.println(e);
	}
	public void wow(String d1) {
		d=d1;
		System.out.println(d);
	}
}

public class Polymorphismoverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fourhundred obj=new fourhundred();
         obj.wow("ranjith");
	}

}
