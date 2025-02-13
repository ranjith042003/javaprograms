package firstproject;
//converting primitive datatypes to objects for data types
public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mp=10;
int cc;
float ds=20.4f;
boolean cd=true;
short vf=3500;
long mg=1000;
double rh=20.4545;
byte lj=120;
 Integer sp=new Integer(mp);   //AUTOBOXING
 System.out.println(sp);
 
 cc=sp;      //unboxing
 System.out.println(cc);
 
 Float vs=new Float(ds);
 System.out.println(vs);
 
 Boolean gg=new Boolean(cd);
 System.out.println(gg);
 
 Short ff=new Short(vf);
 System.out.println(ff);
 
 Long ll=new Long(mg);
 System.out.println(ll);
 
 Double dd=new Double(rh);
 System.out.println(dd);
 
 Byte bb=new Byte(lj);
 System.out.println(bb);
	}

}
