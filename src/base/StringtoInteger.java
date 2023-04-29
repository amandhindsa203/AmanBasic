package base;

public class StringtoInteger {

	//Integer.valueOf()
	public void StringtoIntegerexample1() {
		String s= "200";
		int i = Integer.valueOf(s);
		System.out.println(i);
		}
	//integer.parseint()
	
	public void StringtoIntegerexample2() {
		String s= "300";
		int i = Integer.parseInt(s);
		System.out.println(i);
		}
	
	public static void main(String[] args) {
		StringtoInteger obj = new StringtoInteger();
		obj.StringtoIntegerexample1();
		obj.StringtoIntegerexample2();
	}

}
