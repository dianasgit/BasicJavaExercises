package controlStructures;
import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("\nThis program will calculate the factorial of your choosen value. \n\nInsert the number you want to calculate:");
		int var = scan.nextInt();
		int i=1;
		int j=1;
		int r=0;
		
		while (i <= var) {
			r = i*j;
			j = r;
			++i;
		}			
			
		System.out.println("Result: " +var+ "!= " +r+ ".");		
	} 
}