public class Day6Ex1 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1,2));
		System.out.println(calculator.subtract(106,49));
		System.out.println(calculator.multiply(15,4));
		System.out.println(calculator.divide(100,5));
		System.out.println(calculator.modulus(99,4));
/**
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
**/
	}
}