package firstproject;

public class Arrayexample {
	
	public static void  main (String args[]) {
		
	int a[]=new int[2];
	float b[]=new float[2];
	boolean c[]=new boolean[2];
	char d[]=new char[2];
	String e[]=new String[2];
	{
		 a [0]=4;
		 a[1]=2;
		 b [1]=20.4f;
		 b[0]=30.5f;
		 c [0]=true;
		 c[1]=false;
		 d [1]='R';
		 d[0]='S';
		 e [0]="name";
		 e[1]="string";
		 System.out.println(a[0] +a[1]+"\n"+ b[1] +b[0]+"\n"+c[0]+c[1]+"\n"+d[1]+d[0]+"\n"+e[0]+e[1]);
		 
	}
	}
}
