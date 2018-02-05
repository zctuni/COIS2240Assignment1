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
		
		long startTimeRec=  System.nanoTime(); // Initialize timing of iterative number calculation
		
		for (int i = 0; i < input; i++) {
			System.out.println(fiboSeriesRec(i));
			
		}
		
		long endTimeRec = System.nanoTime();
		
        long timeElapsedRec= endTimeRec-startTimeRec;
        
        System.out.println("Generating these numbers took: " + timeElapsedRec + " nanoseconds"
        		+ " or " + timeElapsedRec/1000000 + " milliseconds.");
		
        
        System.out.println(" "); // Output blank line to console for formatting reasons
		
		// Display iterative Fibonacci results
		System.out.println("Iterative Fibonacci Number Generation:"); // Inform user of calculation method		
		
		long startTimeIte=  System.nanoTime(); // Initialize timing of iterative number calculation
		
		for (int i = 0; i < input; i++) {
			System.out.println(fiboSeriesIte(i));
			
		}
		
		long endTimeIte = System.nanoTime();
		
        long timeElapsedIte= endTimeIte-startTimeIte;
        
        System.out.println("Generating these numbers took: " + timeElapsedIte + " nanoseconds"
        		+ " or " + timeElapsedIte/1000000 + " milliseconds.");
		
	}
	 
	
	// Recursive Fibonacci number calculation
	public static long fiboSeriesRec(long number) {
		if (number == 0 || number == 1) {
			return number;
		}
		return fiboSeriesRec(number-1) + fiboSeriesRec(number-2);
	}
	
	
	// Iterative Fibonacci number calculation
	public static long fiboSeriesIte(long number) {
		long fib1 = 0;
		long fib2 = 1;
		long fibValue =0;
		
		for (int count = 0; count <= number; count++) {
			fibValue = fib1;
			fib1 = fib1 + fib2;
			fib2 = fibValue;
		}
		
		return fibValue;
	}
	
	
}
