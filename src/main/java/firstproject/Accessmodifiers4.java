package firstproject;

    final class xo{
	final int a=10;
	final public void ter() {
		a=50;
		System.out.println("executing parent class method");
	}
}
class ox extends xo{
	public void ter() {
		System.out.println("executing child class");
	}
}

public class Accessmodifiers4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ox obj=new ox();
obj.ter();
	}

}
