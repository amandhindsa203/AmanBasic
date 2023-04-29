package base;
import java.util.Scanner;
public class reversestrg {

	public void reversestrngexample1() {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");// value will be entered by user
		s=sc.nextLine();
		System.out.println("After Reverse String value is : ");
//i will be the length of string
		int i=s.length();
		while(i>0) {
			System.out.print(s.charAt(i-1));  
		i--;
		}

	}
	public void reversestrngexample2() {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");// value will be entered by user
		s=sc.nextLine();
		System.out.println("After Reverse String value is : ");
//i will be the length of string
		
for (int i=s.length();i>0;--i) {
	System.out.print(s.charAt(i-1));  
}
		}
	public static void main(String[] args) {
		reversestrg obj= new reversestrg();
		obj.reversestrngexample1();
		
		obj.reversestrngexample2();
	}

}
