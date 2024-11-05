package package1;
import package2.*;

public class A {
	protected String protectedMsg = "This is the protected access modifier";
	public static void main(String args[]) {
		C Cobject = new C();
		// default access modifier, not visible in package A
		//Cobject.defaultMsg;
		// public access modifier is visible to everyone
		System.out.println(Cobject.publicMsg);
		B Bobject = new B();
		//System.out.println(Bobject.privateMsg);
	}
}
