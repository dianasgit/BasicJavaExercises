/*
 * Write a code that reads 10 numbers and counts how many are even.
 */

package arraysExercises;
import java.util.Scanner;
public class CountEvens {

	public static void main(String[] args) {

		
		System.out.println("\nWrite 10 numbers separed by enter and I will count how many are even: ");

		Scanner scan = new Scanner(System.in);
		double [] listA = new double[10];
		int count=0;

		for (int i=0  ; i<(listA.length)  ; i++) {
			listA[i] = scan.nextDouble();
		}
		
		System.out.print("\n\nThe choose numbers are:");

		for (int i=0  ; i<(listA.length)  ; i++) {
			System.out.print("  "+ listA[i]);
		}

		System.out.print("\n\nAre even: ");

		for (int i=0  ; i<(listA.length)  ; i++) {
			if (listA[i]%2==0) {
				count++;
				System.out.print(listA[i]+ "  ");
			}
		}
		System.out.println("\n\nThe total of even elements are: " + count);

		
	}
}
