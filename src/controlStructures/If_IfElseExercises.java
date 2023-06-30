package controlStructures;

 import java.util.Scanner;

public class If_IfElseExercises {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		/*
		
		
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
		
		
	// #########################################################
	// #########################################################
	
// Faça um código que calcule a folha de pagamento de uma empresa considerando: IR conforme salário bruto ( até 900 isento; até 1500 desconta 15% ; até 2500 desconto 10% ; acima de 2500 desconto de 20%) +  3% sindicato + FGTS de 11%, não é descontado pois é depositado pela empresa. Calcule os salário liquido pedindo ao usuário: Valor da sua hora e quantidade de horas trabalhadas. Imprima na tela as seguintes informação: salario bruto; (-) IR (N%); (-) SINDICATO (N%) ; (FGTS DEPOSITADO) (N%) ; total dos descontos ; salário liquido.
	
	
	System.out.println("DIgite o valor da hora trabalhada: ");
	double valorHora = scan.nextDouble();
	
	System.out.println("Digite a quatidade de horas trabalhadas: ");
	double qtdHoras = scan.nextDouble();
	double salarioBruto = qtdHoras * valorHora;
	
	double ir = 0;
	if (salarioBruto >=2500) {
		ir = 20;
	}else if (salarioBruto >1500 && salarioBruto <2500){
		ir = 10;	
	} else if (salarioBruto >900 && salarioBruto <=1500) {
		ir = 5;
	} else {
		ir = 0;
	}
	
	double descontoIr = (ir*salarioBruto)/100 ;
	double sindicato = salarioBruto*0.03;
	double fgts = salarioBruto*0.11;
	double descontos = descontoIr + sindicato;
	double salarioLiq = salarioBruto - descontos;
	
	System.out.println("Salário bruto = " + salarioBruto);
	
	if (salarioBruto <=900) {
	System.out.println(" (-) IR ("+ir+"%) = ISENTO");
	} else {
	System.out.println(" (-) IR ("+ir+"%) = " + descontoIr);
	}
	
	System.out.println(" (-) Contribuição sindical (3%)= " + sindicato);
	System.out.println(" FGTS Depositado (11%)= " + fgts);
	System.out.println("Total de descontos= "+ descontos);
	System.out.println("Salário líquido= "+ salarioLiq);
	
	*/
		
	// ###############################################################
	// ###############################################################
	
	
	/*Escreva um código que peça do usuário as 3 medidas dos lados de um triângulo e verifique se é um triangulo; e se é equilátero, isóceles ou escaleno.
	 * triangulo = a soma de 2 lado > o terceiro lado
	 * equilátero = tres lados iguais
	 * isósceles = quaisquer dois lados iguais
	 * escaleno = tres lados diferentes
	  */
	
	System.out.println("Este programa vai descobrir se este é um triangulo de verdade e vai calcular de que tipo ele é");
	
	System.out.println("Digite a medida do primeiro lado do triãngulo:");
	double lat1 = scan.nextDouble();
	System.out.println("Digite a medida do segundo lado do triãngulo:");
	double lat2 = scan.nextDouble();
	System.out.println("Digite a medida do terceiro lado do triãngulo:");
	double lat3 = scan.nextDouble();
	
	boolean triangle = true;
	
	//É triângulo?
	if (lat1== 0 || lat2==0 || lat3 == 0) {
		triangle = false; 
		System.out.println("Não é triângulo :(");

		} else if ( (lat1+lat2 ) <lat3 || (lat1+lat3)<lat2 || (lat2+lat3)<lat1) {
		triangle = false;
		System.out.println("Não é Triangulo :( ");
		
		//é equilatero?
		}else if (triangle ==true && lat1 == lat2 && lat2 ==lat3) {
		System.out.println("É triangulo ... do tipo equilátero!");
		 
			//é isosceles?
		}else if (triangle ==true && (lat1 == lat2 && lat2 != lat3) || (lat1 ==lat3 && lat3 != lat2) || (lat2 ==lat3 && lat3 != lat1)) {
		System.out.println("É triangulo... do tipo Isósceles!");
		
			//é escaleno?
		} else if (triangle ==true &&  lat1!=lat2 && lat1!=lat3) 
		{System.out.println("É triangulo... do tipo Escaleno");
			} 
	
	
}
}