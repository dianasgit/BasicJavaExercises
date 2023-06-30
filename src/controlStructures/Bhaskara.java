/****************************************************
 * Write a cone who ask for the value of A, B and C of
 * a quadratic equation and calculate it.
 * Considering: 
 * if A=0 == error, because it is not quadratic equation;
 * if delta<0 == there are no real roots. Inform the user and end the code;
 * if delta>=0 then calculate de possible(s) root(s). 
 * PRINT THE FORMULA
 * and PRINT THE error message (it is not a quadratic equation), or the possible results.
 */

package controlStructures;
import java.util.Scanner;
public class Bhaskara {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
	System.out.println("This program will calculate a quadratic equation using Bhaskara formula!"
	+" Remember, quadratic equation has the value of:  Ax² + Bx + C:");
	
	System.out.println("Inform the value of A:");
	double varA = scan.nextDouble();
	
	if (varA == 0) {
		System.out.println("This is not a quadratic equation.");
	
	}else {
		System.out.println("Inform the value of B:");
		double varB = scan.nextDouble();
	
		System.out.println("Inform the value of C:");
		double varC = scan.nextDouble();
		
		System.out.println("Inform the value of X:");
		double varX = scan.nextDouble();
	
		double delta = ((varB*varB)- (4*varA*varC));
	
			if (delta < 0) {
				System.out.println("There are no real roots for this equation. Please try other values.");
			
				
			} else if (delta==0) {
				double x1 = ((-1*varB - Math.sqrt(delta)) /2 * varA);
				double result = varA*(x1*x1) + (x1*varB) + varC;
				System.out.println("The formula: "+varA +"*"+ varX+"² + "+varB+"*"+varX+ " + " +varC);
				System.out.println("Has Delta = " +delta);
				System.out.println("X1 = " +x1);
				System.out.println("End final result= " + result);
			
				
			} else if (delta >0) {
				double x1 = ((-1*varB - Math.sqrt(delta)) /2 * varA);
				double x2 = ((-1*varB + Math.sqrt(delta)) /2 * varA);
				
				double result1 = varA*(x1*x1) + (x1*varB) + varC;
				double result2 = varA*(x2*x2) + (x2*varB) + varC;
							
				System.out.println("The formula: "+varA +"*"+ varX+"² + "+varB+"*"+varX+ " + " +varC);
				System.out.println("Has Delta = " +delta);
				System.out.println("X1 = " +x1);
				System.out.println("X2 = " +x2);
				System.out.println("End final result= " + result1);
				System.out.println("End final result= " + result2);
			}
	}
}
}