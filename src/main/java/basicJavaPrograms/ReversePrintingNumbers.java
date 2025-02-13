package basicJavaPrograms;
//printing numbers in reverse
public class ReversePrintingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numbers= 123456789;
     int reversenumbers= 0;
     while(numbers !=0) {
    	 int lastDigit = numbers % 10;
    	 reversenumbers= reversenumbers*10+ lastDigit;
    	 numbers=numbers/10;
     }
     System.out.println("Reverse of given number:"+reversenumbers);
	}

}
