package base;

public class Program {
int a=23;
	public void localvariable() {
	//Local variable 
	boolean b =false;// true or false
	byte c= -14;//-128 to 127
	int e = 52;
	int m = 27;
	int p= e+m;
	short d = 5500; //-32000 to 32000
    long h=3652303248l;//10 digits l at the end
    float f=10.5f;//decimal put f at the end
    float o=m; //widening
    int r = (int)f; //narrowing
    byte s=(byte)m;
    byte q = 120;
    byte t =100;
    byte u = (byte)(q+t);
    double j=245.6666d;// four or more decimalplaces and d at end 
    char i = 'f';// stores one character
	
	System.out.println("  e is local variabele   "+   e    +     "  a is ref variable "     +   a);
	System.out.println(b +   " d is short ");
	System.out.println(p + "  addition  ");
	System.out.println(o  +  " Widening");
	System.out.println(r+"  Narrowing )");
	System.out.println(m);
	System.out.println(s + "  Overflow ");
	System.out.println(u);
	
	}
  
    
    
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("variables");
		Program ref = new Program();
		ref.localvariable();
		
	}

}
