package controlStructures.calculator;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("\nThis program will calculate the factorial of your choosen value.");
		
		long num;
		
		do { 
			System.out.println("\nInsert the number you want to calculate:");
			num = scan.nextInt();
				
			if (num < 0) {
				System.out.println("\nInvalid number, try again...");
			}
			
		} while (num<0);
		
		System.out.println("Result: " +num+ "!= " + (Calculator.factorial(num))+ ".");		

	} 
}
