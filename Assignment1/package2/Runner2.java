package package2;

public class Runner2 {

	public static void main(String[] args) {
		
		System.out.println(Runner2.add(5000,1000.5));
		System.out.println(Runner2.multipilication(2,2.5)); 
		System.out.println(Runner2.divition(5,5));
		System.out.println(Runner2.substraction(3,4.1));
		System.out.println(Runner2.divition(1,0));
	}
	
	public static double add(int num1, double num2) {
		double result = num1 + num2;
		return result;
		
	}
	public static double multipilication(int num1, double num2) {
		double result = num1 * num2;
		return result;
		
	}
	public static String divition(int num1, double num2) {
		
			double r = num1 / num2;
			String result = String.valueOf(r);
			if (result.equalsIgnoreCase("Infinity")) {
				return "undefined";	
			}
			return result;	
			
			
		
		
		
	}
	public static double substraction(int num1, double num2) {
		double result = num1 - num2;
		return result;
		
	}
}
