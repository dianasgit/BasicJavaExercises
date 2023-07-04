package arraysExercises;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ListSqrt {

	/**********************
	 * write a code that receives a list A with 8 numeric elements 
	 * and a list B with the square root of each element. 
	 * Print both at the end.
	 */
	
	
	public static void main(String[] args) {

		System.out.println("Write 8 numbers separated by enter and I will print these numbers and the square root of each one: ");
		
		Scanner scan = new Scanner(System.in);
		
		double[] listA = new double [8];
		double [] listB = new double [listA.length];
		
		for (int i=0  ;  i<listA.length  ; i++) {
			listA[i] = scan.nextDouble();
			listB[i] = Math.sqrt(listA[i]);
		}

		DecimalFormat df = new DecimalFormat("###,###.#");		
		System.out.print("\nYou typed= ");
		
		for (int i=0  ; i<listA.length  ; i++) {
			System.out.print(df.format(listA[i]) + "   ");
		}

		System.out.print("\nThe Square Root of each number is = ");
		for (int i=0  ; i<listA.length  ; i++) {
			System.out.print(df.format(listB[i]) + "   ");
		}
		
	}
}
