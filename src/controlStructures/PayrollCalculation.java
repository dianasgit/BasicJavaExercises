package controlStructures;

import java.util.Scanner;

public class PayrollCalculation {

	public static void main(String[] args) {

		
		// Faça um código que calcule a folha de pagamento de uma empresa considerando: IR conforme salário bruto ( até 900 isento; até 1500 desconta 15% ; até 2500 desconto 10% ; acima de 2500 desconto de 20%) +  3% sindicato + FGTS de 11%, não é descontado pois é depositado pela empresa. Calcule os salário liquido pedindo ao usuário: Valor da sua hora e quantidade de horas trabalhadas. Imprima na tela as seguintes informação: salario bruto; (-) IR (N%); (-) SINDICATO (N%) ; (FGTS DEPOSITADO) (N%) ; total dos descontos ; salário liquido.
		
		
		Scanner scan = new Scanner(System.in);
		
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
		
		
	}

}
