/* write a code that receives an array of 10 numeric elements and after
   * select all odd elements and calculate the arithmetic average.
   */

package arraysExercises;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ListMultipleAvareges {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double [] listA = new double [10];
		DecimalFormat df = new DecimalFormat ("###,###.##");
		
		double total = 0;
		int count = 0;
		double avarage;
	
	
		System.out.println("Write 10 numbers: ");
	
		for (int i=0  ;  i<listA.length ;  i++) {
			listA[i] = scan.nextDouble();
		}
		System.out.print("\nYou insert the following elements:  ");
		
		for (int i=0  ;  i<listA.length  ; i++) {
			System.out.print(listA[i]+ "  ");
		}
		
		for (int i=0  ; i<listA.length  ; i++) {
			if (listA[i]%2 != 0) {
				total = total+listA[i];		
				count ++;
			}
		}
		
		avarage = total/count;
		
		System.out.println("\n= " + count + " elements are odd. And the avarege of all odd elements is: "+ df.format(avarage));
		
	}
}
