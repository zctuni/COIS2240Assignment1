import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Welcome the user and introduce the program.
		System.out.println("This is a Fibonacci number generator.");
		
		// Ask user how many Fibonacci numbers to calculate.
		System.out.println("How many Fibonacci numbers would you like to generate?");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
		// Display recursive Fibonacci results
		System.out.println("Recursive Fibonacci Number Generation:"); // Inform user of calculation method
		
		for (int i = 0; i < input; i++) {
			System.out.println(fiboSeriesRec(i));
			
		}
		
		System.out.println(" "); // Output blank line to console for formatting reasons
		
		// Display iterative Fibonacci results
		System.out.println("Iterative Fibonacci Number Generation:"); // Inform user of calculation method		
		
		for (int i = 0; i < input; i++) {
			System.out.println(fiboSeriesIte(i));	
			
		}
	}
	 
	
	// Recursive Fibonacci number calculation
	public static int fiboSeriesRec(int number) {
		if (number == 0 || number == 1) {
			return number;
		}
		return fiboSeriesRec(number-1) + fiboSeriesRec(number-2);
	}
	
	
	// Iterative Fibonacci number calculation
	public static int fiboSeriesIte(int number) {
		int fib1 = 0;
		int fib2 = 1;
		int fibValue =0;
		
		for (int count = 0; count <= number; count++) {
			fibValue = fib1;
			fib1 = fib1 + fib2;
			fib2 = fibValue;
		}
		
		return fibValue;
	}
	
	
}
