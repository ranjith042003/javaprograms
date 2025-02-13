package firstproject;
class nine{
	int b;
	double s;
	public nine(int b1,double s1) {
		b=b1;
		s=s1;
			
	}
	public nine(double s1) {
	  s=s1;
	}
	public void ones(){
		s++;
		System.out.println(s);
	}
}

public class Constructoroverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      nine obj=new nine(20);
      obj.ones();
     
	}

}



	