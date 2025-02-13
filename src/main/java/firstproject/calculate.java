package firstproject;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
				  int amount = 100000;
				  double a = amount * 0.09;
				  double b = amount * 0.09;
				  double c = a+b;
				  
				  System.out.println("Purchases : " + amount);
				  System.out.println("CST@9% : " + a);
				  System.out.println("SST@9% : " + b);
				  System.out.println("GST @18% : " + c);
				  System.out.println("Total bill :"+ (amount + c));
			}
		}
