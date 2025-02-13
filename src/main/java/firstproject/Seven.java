package firstproject;
// applying inheritence for interface (eleven& seven)
public interface Seven {
	int dd=70;
public void arm();
}
interface eight extends Seven{
	public void qwe();
}
class ninne implements eight{
	public void arm() {
		System.out.println("executing arm method");
	}
	public void qwe() {
		System.out.println("executing qwe method");
	}
}