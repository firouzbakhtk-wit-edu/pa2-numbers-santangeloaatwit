package edu.wit.cs.comp1000;

/**
 * Solution to the PA2b assignment.
 * When it runs, it asks the user for values for a, b, and c, and outputs the roots after using the quadratic formula.
 * 
 * @author Alexander Santangelo
 */
import java.util.Scanner;
public class PA2b {

	/**
	 * Starts the program, user inputs a value for a, b, and c, outputs the roots after using the quadratic formula.
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a == 0) {
			System.out.println("The value of 'a' cannot be zero");
			return;
		}
		double root1 = 0, root2 = 0;
		
		if (b*b - 4*a*c<0) {
			System.out.println("Roots: imaginary");
		}else if (b*b-4*a*c == 0) {
			root1 = -b/(2*a);
			System.out.printf("Root: %.2f%n", root1);
			return;
		}else
			root1 = (-b - Math.sqrt(b*b-4*a*c)) / (2*a);
			root2 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a);
			
			if(root1 > root2) {
				double temp = root1;
					root1 = root2;
					root2 = temp;
			}
			if (b*b - 4*a*c<0) {
			
			}else {
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
			}
		}
	}

