package package1;
import package2.*;

public class B {
	private String privateMsg = "This is the private access modifier";
	
	public static void main(String a[]) {
		B Bobject = new B();
		System.out.println(Bobject.privateMsg);
	}
}
