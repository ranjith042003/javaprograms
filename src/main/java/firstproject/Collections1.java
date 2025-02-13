package firstproject;
//arraylist to store same datatype values
import java.util.ArrayList;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Boolean> y=new ArrayList<Boolean>();
    y.add(true);
    y.add(false);
  //  y.add("block")
    System.out.println(y);
    y.remove(1);
    System.out.println(y);
    System.out.println(y.get(0));
	}



}
