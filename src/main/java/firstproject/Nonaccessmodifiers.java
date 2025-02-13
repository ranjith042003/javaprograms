package firstproject;
class pack{
    static int a=20; 
         int b=30;
    static public void rex() {
    	System.out.println("executing rex method"+a);
    }
    public void wer() {
    	System.out.println("executing wer method"+b);
    }
}


public class Nonaccessmodifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pack.a);
		pack obj=new pack();
		 obj.wer();

	}

}
