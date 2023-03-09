package calculator_pkg;

public class Calculator {
	static int sum(int a, int b) {
		int result = a + b;
		System.out.println("Sum is: " + result);
		return result;
	}

	static int product(int a, int b) {
		int result = a * b;
		System.out.println("Product is: " + result);
		return result;
	}

	static int subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Subtration is: " + result);
		return result;
	}

	static double division(double a, double b) {
		// if we use int as params we will get a rounding error
		// we must use double instead of int
		double result = a / b;
		System.out.println("Divison is: " + result);
		return result;
	}

	public static void main(String[] args) {
		sum(6, 4);
		product(6, 4);
		subtraction(6, 4);
		division(6, 4);
	}
}
