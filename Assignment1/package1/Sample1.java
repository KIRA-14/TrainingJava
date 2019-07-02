package package1;

public class Sample1  implements Defaultmethod{

	   public void method1() {
		   Defaultmethod.super.method1();
	}
	protected static void method2() {
		System.out.println("protected method");
	}
	
}
