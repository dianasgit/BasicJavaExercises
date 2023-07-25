/*
 * write a code where the user types 10 integer elements 
 * and a new array prints the factorial of each element.
 */

package arraysExercises;
import java.util.Scanner;

public class arrayFactorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int [] listA = new int [10];
		int [] listFac = new int [listA.length];
		
		System.out.println("Write 10 integer number separed by enter");
			
		for (int i=0 ; i<listA.length  ; i++) {
			listA[i] = scan.nextInt();
		}
		
		for (int i=0  ; i<listA.length  ; i++) {
			
			listFac[i]=1;
			for (int j = 1 ;  j<=listA[i]  ; j++) {
				if (listA[i]<=0) {
					listFac[i] = 0;
				}else {
					listFac[i] *= j ;
				}
			}
		}
			
		System.out.println("The factorials of the chosen numbers are (remember, there are no factorials for negative numbers) =   ");

		for (int i=0 ; i<listA.length  ; i++) {
			System.out.print(listFac[i] +"  ");
		}
		
	}
}
