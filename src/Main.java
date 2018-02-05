/* ------------------------------------------------------------------------------------------
 * COIS 2240H - Software Design and Modelling - Assingment 1
 * 
 * Created by Zachary Cox, February 2018
 * 
 * Fibonacci sequence generator: The intent of this java program is to print a Fibonacci 
 * sequence to the nth number specified by the user. The program will print the sequence
 * using a recursive calculation method and an iterative calculation method, timing both
 * and displaying the time taken to generate the list using each method.
 *  
 * CODE SOURCE: The timing calculations are adapted from Professor Addas's
 * "RecursionExample+TimingExample" project. Recursive method adapted from java2s.com
 * (http://www.java2s.com/Tutorial/Java/0100__Class-Definition/Recursivefibonaccimethod.htm)
 * Iterative Fibonacci calculation adapted from Vishal Naik's post on JAVA-FRIES
 * (http://www.java-fries.com/2014/11/nth-fibonacci-number-java/).
 *
 * 
 ------------------------------------------------------------------------------------------*/

import java.util.Scanner; // Required for using scanner to take user input

public class Main {

	public static void main(String[] args) {
		
		// Welcome the user and introduce the program.
		System.out.println("This is a Fibonacci number generator.");
		
		// Ask user how many Fibonacci numbers to calculate.
		System.out.println("How many Fibonacci numbers would you like to generate?");
		
		// Initiate scanner for taking user input
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close(); // Close scanner to limit resource leak
		
		
        System.out.println(" "); // Output blank line to console for formatting reasons
        System.out.println(" "); // Output blank line to console for formatting reasons
        
        
		
		// Display RECURSIVE Fibonacci results
        // Inform user of calculation method
        System.out.println("Recursive Fibonacci Number Generation:");
		
        // Mark calculation start time for timing purposes
		long startTimeRec=  System.nanoTime(); 
		
		// Run 
		for (int i = 0; i < input; i++) {
			
			System.out.print(fiboSeriesRec(i) + " "); // Add space after each number for readability
		
		}
		
        // Mark calculation end time for timing purposes
		long endTimeRec = System.nanoTime();
		
		// Calculate time taken to display results using recursive method
        long timeElapsedRec= endTimeRec-startTimeRec;
        
        System.out.println(" "); // Output blank line to console for formatting reasons
        
        // Print time taken to calculate list of numbers using recursion to the console
        System.out.println("Generating these numbers took: " + timeElapsedRec + " nanoseconds"
        		+ " or " + timeElapsedRec/1000000 + " milliseconds.");
		
                System.out.println(" "); // Output blank line to console for formatting reasons


		// Display ITERATIVE Fibonacci results
        // Inform user of calculation method
		System.out.println("Iterative Fibonacci Number Generation:");		
		
        // Mark calculation start time for timing purposes
		long startTimeIte=  System.nanoTime();
		
		for (int i = 0; i < input; i++) {
			
			System.out.print(fiboSeriesIte(i) + " "); // Add space after each number for readability
			
		}
		
        // Mark calculation end time for timing purposes
		long endTimeIte = System.nanoTime();
		
		// Calculate time taken to display results using iterative method
        long timeElapsedIte= endTimeIte-startTimeIte;
        
        System.out.println(" "); // Output blank line to console for formatting reasons
        
        // Print time taken to calculate list of numbers using iteration to the console
        System.out.println("Generating these numbers took: " + timeElapsedIte + " nanoseconds"
        		+ " or " + timeElapsedIte/1000000 + " milliseconds.");
		
	}
	 
	
	// Recursive Fibonacci number calculation
	// Adapted from http://www.java2s.com/Tutorial/Java/0100__Class-Definition/Recursivefibonaccimethod.htm
	public static long fiboSeriesRec(long number) {
		
		if (number == 0 || number == 1) {
			
			return number;
			
		}
		
		return fiboSeriesRec(number-1) + fiboSeriesRec(number-2);
	
	}
	
	
	// Iterative Fibonacci number calculation
	// Adapted from http://www.java-fries.com/2014/11/nth-fibonacci-number-java/
	public static long fiboSeriesIte(long number) {
		
		// Initiate required variables
		long fib1 = 0;
		long fib2 = 1;
		long fibValue =0;
		
		for (int count = 0; count <= number; count++) {
			
			fibValue = fib1; 
			fib1 = fib1 + fib2; // Calculate next Fibonacci value
			fib2 = fibValue; // Pass current Fibonacci value to fib2
			
		}
		
		return fibValue;
	}
	
	
}
