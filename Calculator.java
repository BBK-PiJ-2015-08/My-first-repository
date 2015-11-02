public class Calculator {
	private int num1;
	private int num2;

	void int add (int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	void int subtract (int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}

	void int multiply (int num1, int num2) {
		int	result = num1 * num2;
		System.out.println(result);
	}

	void int divide (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double result = num1 / num2;
		System.out.println(result);
	}

	void int modulus (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double result = double1 % double2;
	}
}

int calculation 