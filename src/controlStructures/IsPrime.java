package controlStructures;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("\nWrite an integer number and find out if it is prime: ");
	int number = scan.nextInt();
	
	int i = 2;
	boolean flag = true;
	float q;
	
	while (i < number && flag== true){		
		q = number % i;
		
		if (q == 0 ) {
			flag = false;
		} else {
			flag = true;
			i++;
		}		
	}
	if (flag == false) {
		System.out.println("Not prime.");
	} else {
		System.out.println("It is a prime number.");
	}
	
	
	}
}