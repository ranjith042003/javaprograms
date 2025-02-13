package firstproject;
//program for a class by implementing 2 interfaces (ten&sevenhundred)
public interface Ten {
int rr=4;
public void For();
}
interface teen
{
	public void loop();
}
class twoone implements Ten,teen{
	public void For() {
		System.out.println("executing For method");
	}
	public void loop() {
		System.out.println("executing loop method");
	}
}
