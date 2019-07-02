package package1;

public class RunnerClass {

	

	public static void main(String[] args) {
		ChieldAbstract ca = new ChieldAbstract();
		FinialClass fc = new FinialClass();
		ImplementingAbstract ia = new ImplementingAbstract();
		ParentInterface pi = new ParentInterface();
		 ca.m1(); 	// m1 to m5
		 fc.m1(); 	// m1 to m5
		 ia.m3();  	// m1 to m3
		 pi.m1(); 	// m1 to m3
		

	}

}
