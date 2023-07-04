/*
 * create a code that receives 10 numbers in an array and then 
 * calculates and prints how many % of these numbers are odd and how many are even.
 */

package arraysExercises;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentOfElements {

	public static void main(String[] args) {
		
		double [] listA = new double [10];
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		int odd = 0;
		int even = 0;
		
		System.out.println("Write 10 numbers separed by enter: ");
		
			for (int i=0  ; i<listA.length  ; i++) {
				listA [i] = scan.nextDouble();
			}	
		
			for (int i=0  ; i<listA.length  ;  i++) {
				if (listA[i] % 2 == 0) {
					even++;
				} else { 
					odd++;
				}
			}	
			
		System.out.println("The percent of even numbers is= "+ df.format((even*100)/ listA.length)+"%");
			
		System.out.println("\nThe percent of odd numbers is= "+  df.format((odd*100)/ listA.length)+"%" );
	
		
	}
}


