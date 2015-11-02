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

	public double divide (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double doubleResult = double1 / double2;
		System.out.println(doubleResult);
		return doubleResult;
	}

	public double modulus (int num1, int num2) {
		double double1 = (double) num1;
		double double2 = (double) num2;
		double doubleResult = double1 % double2;
		System.out.println(doubleResult);
		return doubleResult;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
//		System.out.println(calculator.add(1,2));
		System.out.println("Enter an integer");
		String numberOne = System.console().readLine();
		System.out.println("Enter another");
		String numberTwo = System.console().readLine();
		System.out.println("Enter +, -, *, / or %");
		String choice = System.console().readLine();
		int num1 = Integer.parseInt(numberOne);
		int num2 = Integer.parseInt(numberTwo);
		switch(choice) {
			case "+":
				System.out.println(calculator.add(num1,num2));
				break;			
			case "-":
				System.out.println(calculator.subtract(num1,num2));
				break;
			case "*":
				System.out.println(calculator.multiply(num1,num2));
				break;
			case "/":
				System.out.println(calculator.divide(num1,num2));
				break;
			case "%":
				System.out.println(calculator.modulus(num1,num2));
				break;
			default:
				System.out.println("Invalid input");
				break; 
		}
	}
}