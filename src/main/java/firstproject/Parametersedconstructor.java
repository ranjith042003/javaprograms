package firstproject;
class firstterm{
	int a;
	float s;
	String d;
	char f;
	public  firstterm(int a1,float s1,String d1,char f1) {
		a=a1;
		s=s1;
		d=d1;
		f=f1;
				
	}
	public void mert(){
		System.out.println(a+"\n"+s+"\n"+d+"\n"+f);
	}
}

public class Parametersedconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstterm obj=new firstterm(20,20.5f,"ring",'r');
                   obj.mert();
	}

}
