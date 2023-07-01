package controlStructures;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("\nThis code will print the fibonacci sequence up to the nth number of your choice.\n");
	
	System.out.println("Chose the upper limit of your Fibonacci sequence.");
	int limit = scan.nextInt();
	
	int i = 1;
	int j = 1;
	int n = 0;

	System.out.println("Result: ");
	System.out.print("1 1");

		while (j <= limit) {
		n = i+j;
		i=j;
		j=n;
		if (n<=limit) {
			System.out.print(" "+ n+" ");
		}
	}
		
	}
}
