package controlStructures;
import java.util.Scanner;
public class WhileloopAllExercises {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
//###########################################################################################
/*	
	// Faça um codigo que peça uma nota entre zero e dez. Mostre uma msg caso o valor seja inválido e continue pedindo até que o usuário informe o valor válido. //
	
	boolean ok = false;
		do {
		System.out.println("Write a note between 0 and 10:");
		double nota = scan.nextDouble();
		
		if (nota >0 && nota <=10) {
			System.out.println("You write a correct note: "+ nota);
			ok =true;
		}else {	
			System.out.println("Incorrect. Try again.");
			ok = false;
		}
	}
		while (ok == false);
*/
		
// ############################################################################################
	
/*	
	//faça um código que receba um nome de usuário e senha e não ceite que ambos sejam iguais mostrando uma meng de erro caso seja e solicitando nova inserção.
	
	boolean correct = false;
	
	do {
		System.out.println("Write you user name:");
		String name = scan.next();
	
		System.out.println("\nWrite you password (must be different then name:");
		String pass = scan.next();
	
		if (name.equalsIgnoreCase(pass) ) {
			System.out.println("Incorrect, try again.");
			correct=false;

		}else {
			System.out.println("The choose username is: "+ name);
			System.out.println("The choose password is: "+ pass);
			correct = true;
		}
	} while (correct == false);
	
*/	
// #############################################################	
	
/*	
	
	// faça um programa que leia e valide as seguintes informações: nome maior que 3 caracteres; idade entre 0 e 150; salário maior que 0; sexo f ou m ; estado civil s,c,v,d.
	
	boolean correct = false;
	
	//name >=4 char
	do {
		System.out.println("\nWrite your name (3 char minimun):");
		String name = scan.next();
		
		if (name.length() <3) {
			System.out.println ("Incorrect, tray again...");
		}else {
			correct = true;
		}
	}while (correct == false);
	
//idade entre 0 e 150 	
	correct = false;
	do {
		System.out.println("\nWrite your age:");
		int age = scan.nextInt();
		
		if (age<0 || age>150) {
			System.out.println ("Incorrect, tray again...");
		}else {
			correct =true;
	} 
	}while (correct == false);
	
// salário maior que 0		
	correct = false;
	do {
		System.out.println("\nWrite your salary:");
		int salary = scan.nextInt();
		
		if (salary<0) {
			System.out.println ("Incorrect, tray again...");
		}else {
			correct =true;
		} 
	}while (correct == false);
	
	
//sexo f ou m	
	correct = false;
	do {
		System.out.println("\nWrite your gender(f/m):");
		String gender = scan.next();
		
		if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m") ) {
			correct =true;
		}else {
			System.out.println ("Incorrect, tray again...");
		}
	}while (correct == false);
	

// status relacionamento
	correct = false;		
	do {
		System.out.println("\nWrite your relationship status (C / S / V / D):");
		String relation = scan.next();
				
		if ( relation.equalsIgnoreCase("c") || relation.equalsIgnoreCase("S") || relation.equalsIgnoreCase("D") || relation.equalsIgnoreCase("v") ) {
			correct =true;
		}else {
			System.out.println ("Incorrect, tray again...");
		} 
	} while ( correct == false);
	
	System.out.println("ok, registration completed");
	
*/	

// ###############################################
	
	
/*	
// faça com prigrama que leia 5 numeros e insforme o maior deles:
	
	System.out.println("\nWrite 5 integer numbers and I will print the bigger:");
	
	int num;
	int larger = Integer.MIN_VALUE;
	
	for (int i=0; i<5 ; i++) {
		num = scan.nextInt();
		
		if (num > larger) {
			larger = num;
		}
	}

	System.out.println("the larger number inserted is: " + larger);
	
*/	
	
	
// #######################################################################
	
/*	
	// write a program to scan 5 numbers and print the summation and the arithmetic average.
	
	
	System.out.println("Write 5 numbers and I will calculate the summation and the arithmetic average");
	
	double sum = 0;
	double num = 0;
	int i;
	
	for ( i=0; i<5 ; i++) {
		num = scan.nextDouble();
		sum += num;
	}
	
	double result = sum/5;
	
	System.out.println("The Summation is: "+ sum);
	System.out.println("The arithmetic average is: "+ result);
	
*/	
	
	// #######################################################################
/*	
	
	// escreva um código que receba dois numeros inteiros e imprima todos os numeros inteiros que estão no intervaço entre eles:
	
	double numb1;
	double numb2;
	double modVar;
	
	System.out.println("Write two numbers and I will print all integer numbers how are between those:");
	System.out.println("Write the first:");
	numb1 = scan.nextDouble();
	
	System.out.println("Write the second:");
	numb2 = scan.nextDouble();
	
	modVar = numb1 % 1;
	numb1 = numb1 - modVar + 1;
	
	do {
		System.out.print("  "+ numb1);
		numb1++;
	}
	while (numb1 < numb2);
	
*/	
	
//#################################################################	
	
	/*
	
	
	// escreva um codigo onde o usuário informa a base e o expoente e o programa calcula a potencia.
	
	System.out.println("\nWrite an base number:");
	double base = scan.nextDouble();
	
	System.out.println("\nWrite an integer power number: ");
	int power = scan.nextInt();
	int i = 0;
	double result =1;
	
	do {
		result *=base;
		i++;
	}
	while(i < power);
	System.out.println(result);
	
// ex = 2⁴ = ciclo i1 1*2 // i2  2*2   = 4 // i3 4*2 =8  // i4  8*2  =16   
	
	
	
	*/
	
	// #################################################################
	
	
	
/*	
	
	// escreva um codigo que solicite 10 numeros inteiros e calcule a cardinality the numeros pares e de numeros impares
	
	
	System.out.println("Escreva 10 numeros inteiros e irei calcular a cardinality dos pares e impares:");
	
	int oddi = 0;
	int even = 0;
	int i = 0;
	
	while (i<10) {
		int varX = scan.nextInt();
		i+=1;
		
		if (varX%2 == 0) {
			even++;
		}else { 
			oddi +=1;
		}
	}
	
		System.out.println("odd="+oddi+ "     even="+even);
	
*/
		
		
	//######################################################################
	

	/*
	
	
// faça um programa que receba n numeros e de termine o maior valor, o menor valor e a soma dos valores.
	
		        
	        System.out.println("\nWrite N numbers and I will print the lower, the upper, and the summation. Press any character different then number + Enter to finish and print the result.\n");
	        
            
	        double number = scan.nextDouble();
	        
	        double upper = number;
	        double lower = number;
	        double sum = number;
	        
	        while (scan.hasNextDouble()) {  //---método da classe Scanner verifica se há um próximo número a ser lido         
	           number = scan.nextDouble();
	            
	            if (number > upper) {
	                upper = number;
	            } else if (number > lower) {
	                lower = number;
	            }
	            
	            sum += number;
	        }
	        
	        System.out.println("Lower = " + lower + "   Upper = " + upper + "   Sum = " + sum);
	        
*/
	
//###############################################################################################################################
	/*
	
	// escreva um programa que imprima todos os numeros primos até um N fornecido pelo usuário
	        
	
	  System.out.println("\nEste programa vai imprimir todos os números primos até um limite N. \nDigite o valor do limite N que deseja calcular:");
	  int limit = scan.nextInt();
	  System.out.println("\nAll prime numbers upto "+limit +":");
	  int prime = 1;
	  int div = 2;
	  int cont=0;
	  		
		do {		
			boolean isPrime = true;
		
			while (div < prime) {
				
				if (prime % div == 0 ) {
					cont++;
					isPrime=false;
					break;
				}	
					div++;	
					cont++;
			}	
				if (isPrime && prime!=1) {
				System.out.print(prime + "  ");
			} 
				
				prime++;
				div=2;	
		} while (prime <= limit);
	  
	  System.out.println("\n\nI make "+ cont+ " divisions in this process");
	
	
	*/
	
	
	//###########################################################################################################
	
	
	/*
	 * 
	// Escreva um programa que receba  N de numeros imprima quandos deles estão entre 0-25 e 26-50 e 51-75 e 76-100.
	
	System.out.println("Insira quantos numeros desejar e eu vou contar quantos deles então dentro dos seguintes intervalos: 0-25 e 26-50 e 51-75 e 76-100. para finalizar a contagem digite um numero negativo+enter");
	
	int cont25 = 0;
	int cont50 = 0;
	int cont75 = 0;
	int cont100 = 0;
	double number;
	
		do {
					
		number = scan.nextDouble();

			if (number >=0  && number <= 25) {
				cont25+=1;
			
			}else if (number >= 26 && number <= 50) {
				cont50+=1;
			
			}else if (number >= 51 && number <= 75) {
				cont75+=1;
			
			}else if (number >=76 && number <= 100) {
				cont100+=1;
			}
			
		} 	while (number > -1);  
		
		
			System.out.println("There are "+ cont25+ " numbers between 0 and 25");
			System.out.println("There are "+ cont50+ " numbers between 26 and 50");
			System.out.println("There are "+ cont75+ " numbers between 51 and 75");
			System.out.println("There are "+ cont100+ " numbers between 76 and 100");
			
		
		
			*/
	
// ###################################################################
			
			
			
			
			
			
			
			
			
	
//----------------------
	}	
}
