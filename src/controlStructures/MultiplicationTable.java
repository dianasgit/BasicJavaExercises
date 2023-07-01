/*Write a code how reed two imputed values and write the multiplication table between these numbers (considering * from 0 to 10) 
 */

package controlStructures;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("\n###This code will print a multiplication table (from 0 to 10) by multiplying the interval between two integer values of your choice: \n\n");
	
	System.out.println(" ***Inform the value of the lower multiplier:");
	int var1 = scan.nextInt();
	
	System.out.println("\n***Informe the value of the upper multiplier:");
	int var2 = scan.nextInt();		
	
	int i;
	int result;
	
	while(var1 <= var2) {
		System.out.println("\n_____Multiplication table of "+var1+"._____");
		
			for (i=0  ; i<=10 ; i++) {
				result = var1 * i;
				System.out.println( var1 + " x " +i+ " = " +result);
			} 
		var1++;
	}

	}
}
