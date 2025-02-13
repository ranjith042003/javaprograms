package firstproject;
 class callbyvalue{
	 int a;
	 float f;
	 char c;
	 String s;
	 boolean r;
	 public void met(int b,float g,char h,String v,boolean d) 
	 {
		 a=b;
		 f=g;
		 c=h;
		 s=v;
		 r=d;
		 
		 System.out.println(a+"\t"+f+"\t"+c+"\t"+s+"\t"+r);
	 }
 }

public class Encapsualtioncallbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyvalue obj=new callbyvalue();
		  obj.met(10,20.5f,'r',"ran",true);	
		  }

}
