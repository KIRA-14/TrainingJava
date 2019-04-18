package package2;

import package1.Operation;

public class Runner3 {

	public static void main(String[] args) {
		Operation a = new Operation();
		 a.multiply(2, 5);
		
		int b = a.multiply(2, 2, 2);
		System.out.println(a);
	}

}
