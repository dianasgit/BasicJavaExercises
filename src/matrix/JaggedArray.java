/*
 * write a code that receives and stores data from a census:
 * The number of children of different couples and the name 
 * of each child will be collected. 
 * The matrix must be constructed in such a way that each piece of data
 * occupies only the necessary space. 
 * At the end, print the number of people interviewed;
 * the number of children of each respondent and the names of the children.
 * 
 */

package matrix;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Write the number of people to be interviewed: ");
		int qttInterview = scan.nextInt();
		
		String [] [] names = new String [qttInterview] [] ; 
		
		
		for (int i=0 ; i<names.length  ; i++) {
			System.out.println("Interview nº "+ (i+1) + ". How many kids do you have?");
			int qttKids = scan.nextInt();
			
			names[i] = new String[qttKids];
			
			for (int j=0 ; j<names[i].length ; j++) {
				
				System.out.println("Write the name of the kid "+(j+1)+" : ");
				
				names [i][j] = scan.next();
			}
		}
		
		for (int i=0  ; i<names.length  ; i++) {
			System.out.print("\n\n"+(i+1)+ "Interviewed has: "+ names[i].length + " kids, named: ");
			
			for (int j=0 ; j<names[i].length ; j++) {
				System.out.print(names[i][j]+ "   ");
			}	
		}
		
	}
}
