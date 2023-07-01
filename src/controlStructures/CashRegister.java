package controlStructures;
import java.util.Scanner;
public class CashRegister {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int i=1;
	boolean out = false;
	double amont=0;
	double change; 

	
	System.out.println("\n*****Welcome to Cash Register System:***** \n\n Write the value of each product using dot (.) to separe the cents if necessary.\nWhen you finish, press 0 and Enter to continue:\n");
	
	while (out==false) {

		System.out.println(i+ " - Product price = " );
		double price = scan.nextDouble();
		i++;
		amont += price;
		
			if (price ==0) {
				out=true;
				break;
		}else {
			out =false;
		}
	}	
	System.out.println("\n***FINAL AMONT= "+ amont+ " ***");
	
	System.out.println("\nInform the value receipt from client:");
	double received = scan.nextDouble();
	
	change = received-amont;
	
	System.out.println("\nReturn the change of = "+change);
	
	System.out.println("\n**********************************************\n To start a new purchase press the play button. \n**********************************************");
	
	}
	
}
