package firstproject;
//method overloading by changing number of parameters 
class hundred{
	int a;
	int b; int c;
	public void clock(int a1,int b1) {
		a=a1;
		b=b1;
		System.out.println(a+"\t"+b);
	}	
	
		public void clock(int a1,int b1,int c1) {
			a=a1;
			b=b1;
			c=c1;
			System.out.println(a+"\t"+b+"\t"+c);
		}
	}

public class Polymorphismmethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 hundred obj=new hundred();
    obj.clock(69,89,67);
	}

}
