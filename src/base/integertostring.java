package base;

public class integertostring {
// using String.valueOf()
	public void integertostringexample1() {
		int i =300;
		String s = String.valueOf(i);
		System.out.println(i+100);// here used + sign to check is it doing addition
		System.out.println(s+100);// to check is it working as concatenation as it is a string
		
	
	}
	// Using Integer.toString()
	public void integertostringexample2() {
		int i =400;
		String s = Integer.toString(i);
		System.out.println(i+100);// here used + sign to check is it doing addition
		System.out.println(s+100);// to check is it working as concatenation as it is a string
		
	}
	// using String.format()
	public void integertostringexample3() {
		int i =200;
		String s = String.format("%d",i);
		System.out.println(i+100);// here used + sign to check is it doing addition
		System.out.println(s+100);// to check is it working as concatenation as it is a string
		
	}
		public static void main(String[] args) {
			integertostring obj= new integertostring();
			obj.integertostringexample1();
			obj.integertostringexample2();
            obj.integertostringexample3();
	}

}
