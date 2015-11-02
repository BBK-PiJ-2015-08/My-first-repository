public class Calculator {
	private int num1;
	private int num2;

	public int add (int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}

	public int subtract (int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
		return result;
	}

	public int multiply (int num1, int num2) {
		int	result = num1 * num2;
		System.out.println(result);
		return result;
	}

	public int divide (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double result = num1 / num2;
		System.out.println(result);
		return result;
	}

	public int modulus (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double result = double1 % double2;
		return result;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1,2));
	}
}