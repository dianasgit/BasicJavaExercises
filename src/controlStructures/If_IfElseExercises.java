package controlStructures;

 import java.util.Scanner;

public class If_IfElseExercises {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
	
		
		
		// Write a code to scan 3 numbers and print then from the larger to the smaller. 
	System.out.println("Escreva o primeiro número:");
	int n1 = scan.nextInt();
	
	System.out.println("Escreva o segundo número: ");
	int n2 = scan.nextInt();
	
	System.out.println("Escreva o terceiro número: ");
	int n3 = scan.nextInt();
	
	// ATENÇÃO: write if (n1 >= n2 >= n3) DON'T WORK..
	//you must do as follow:
	
	if (n1 >= n2 && n2 >= n3) {
		System.out.println("A sequencia decrescente é: " +n1+ " - " +n2+ " - " + n3+". ");
	} else if (n1>=n3 && n3>=n2) {
		System.out.println("A sequencia decrescente é: " +n1+ " - " +n3+ " - " + n2+". ");
	} else if (n2>=n1 && n1>=n3) {
		System.out.println("A sequencia decrescente é: " +n2+ " - " +n1+ " - " + n3+". ");
	} else if (n2>=n3 && n3>=n1) {
		System.out.println("A sequencia decrescente é: " +n2+ " - " +n3+ " - " + n1+". ");
	} else if (n3>=n1 && n1>=n2) {
		System.out.println("A sequencia decrescente é: " +n3+ " - " +n1+ " - " + n2+". ");
	} else {
		System.out.println("A sequencia decrescente é: " +n3+ " - " +n2+ " - " + n1+". ");
	}
		

	
	
}
}