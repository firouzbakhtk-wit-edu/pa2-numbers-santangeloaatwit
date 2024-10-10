package edu.wit.cs.comp1000;

/**
 * Solution to the PA2a assignment.
 * When it runs, it ask the user to input five whole numbers, which finds the sum of the positive, non-positive, and every number input by the user.
 * 
 * @author Alexander Santangelo
 */
import java.util.Scanner;
public class PA2a {

	/**
	 * Starts the program, user inputs 5 whole number when prompted, finds the sum of the positive, non-positive, and every number input by user.
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sumPositive = 0, sumNonPositive = 0, sumAll = 0;
		int countPositive = 0, countNonPositive = 0;
		
		System.out.printf("Enter five whole numbers: "); 
		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();
			sumAll += num;
			
			if(num > 0) {
				sumPositive += num;
				countPositive++;
			} else {
				sumNonPositive += num;
				countNonPositive++;
			}
		}
		
		double avgPositive;
		if(countPositive >0 ) {
			avgPositive = (double) sumPositive / countPositive;
		} else {
			avgPositive = 0.0;
		}
		
		double avgNonPositive;
		if(countNonPositive >0) {
			avgNonPositive = (double) sumNonPositive / countNonPositive;
		} else {
			avgNonPositive = 0.0;
		}
		
		double avgAll = (double) sumAll/5;
		
		if(countPositive == 1) {
			System.out.printf("The sum of the " + countPositive + " positive number: " + sumPositive + "%n");
		}else {
			System.out.printf("The sum of the " + countPositive + " positive numbers: " + sumPositive + "%n");
		}
		
		if(countNonPositive == 1) {
			System.out.printf("The sum of the " + countNonPositive + " non-positive number: " + sumNonPositive + "%n");
		}else {
			System.out.printf("The sum of the " + countNonPositive + " non-positive numbers: " + sumNonPositive + "%n");
		}
		
		System.out.printf("The sum of the 5 numbers: " + sumAll + "%n");
		
		if(countPositive == 1) {
			System.out.printf("The average of the " + countPositive + " positive number: %.2f%n", avgPositive);
		}else {
			System.out.printf("The average of the " + countPositive + " positive numbers: %.2f%n", avgPositive);
		}
		if(countNonPositive == 1) {
			System.out.printf("The average of the " + countNonPositive + " non-positive number: %.2f%n", avgNonPositive);
		}else {
			System.out.printf("The average of the " + countNonPositive + " non-positive numbers: %.2f%n", avgNonPositive);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
	}

}
