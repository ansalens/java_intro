package package2;
import package1.*;

public class Asub extends A{
	public static void main(String args[]) {
		//C Cobject = new C();
		// default modifier is visible only in package
		//System.out.println(Cobject.defaultMsg);
		Asub asub = new Asub();
		// Protected modifier is only visible to classes that inherit that class
		// in which protected variable/method is defined independent of packages
		System.out.println(asub.protectedMsg);
	}
}
