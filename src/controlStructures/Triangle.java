/************************************************************************************ 
* Write a code that asks the user for the 3 sides of a triangle and checks that:
* Is a triangle = the sum of any 2 sides > the third side... and if it is, check that:
* It is equilateral = three equal sides;
* Is isosceles = any two equal sides;
* or Is scalene = three different sides. :)))
*************************************************************************************/
package controlStructures;
import java.util.Scanner;

	public class Triangle {
	public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);


		System.out.println("This program will find out if your numbers can form a real triangle and calculate what type it is...");
			
		System.out.println("Enter the length of the first side of the triangle:");
			double lat1 = scan.nextDouble();

		System.out.println("Enter the length of the secondo side of the triangle:");
			double lat2 = scan.nextDouble();

		System.out.println("Enter the length of the third side of the triangle:");
			double lat3 = scan.nextDouble();
			
			boolean triangle = true;
			
		//IS TRIANGLE?
			if (lat1== 0 || lat2==0 || lat3 == 0) {
				triangle = false; 
				System.out.println("It's not a triangle.");

			} else if ( (lat1+lat2 ) <lat3 || (lat1+lat3)<lat2 || (lat2+lat3)<lat1) {
				triangle = false;
				System.out.println("It's not a triangle.");
				
		//IS EQUILATERAL?
			} else if (triangle ==true && lat1 == lat2 && lat2 ==lat3) {
				System.out.println("It's a triangle and it's Equilateral!");
				 
		//IS ISOSCELES?
			}else if (triangle ==true && (lat1 == lat2 && lat2 != lat3) || (lat1 ==lat3 && lat3 != lat2) || (lat2 ==lat3 && lat3 != lat1)) {
				System.out.println("It's triangle and it's Isosceles!");
				
		//IS SCALENE?
			} else if (triangle ==true &&  lat1!=lat2 && lat1!=lat3) {
				System.out.println("It's triangle and it's scalene!");
			}
			
	}
	}
	