package q1dividingintegers;

public class Calculator {
	private int num1;
	private int num2;

	private int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	private int subtract (int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	private int multiply (int num1, int num2) {
		int	result = num1 * num2;
		return result;
	}

	private double divide (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double doubleResult = double1 / double2;
		return doubleResult;
	}

	private double modulus (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double doubleResult = double1 % double2;
		return doubleResult;
	}
}