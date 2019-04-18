package package2;

public class Runner2 {

	public static void main(String[] args) {
		
		System.out.println(Runner2.add(2));
		System.out.println(Runner2.multipilication(2)); 
		System.out.println(Runner2.divition(5));
		System.out.println(Runner2.substraction(3));
		System.out.println(Runner2.divition(0));
	}
	
	public static int add(int num2) {
		int num1 = 5;
		int result = num1 + num2;
		return result;
		
	}
	public static int multipilication(int num2) {
		int num1 = 5;
		int result = num1 * num2;
		return result;
		
	}
	public static String divition(int num2) {
		try {
			int num1 = 5;
			int r = num1 / num2;
			String result= String.valueOf(r);
			return result;
			
		} catch (Exception e) {
			
			String undefind = "undefind";
			return undefind;	
		}
		
		
	}
	public static int substraction(int num2) {
		int num1 = 5;
		int result = num1 - num2;
		return result;
		
	}
}
