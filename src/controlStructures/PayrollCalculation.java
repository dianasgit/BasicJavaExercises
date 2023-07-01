/*Write a code that calculates the payroll of a company considering:
- Government tax "IR" according to gross salary, being: up to 900 exempt; up to 1500 15% discount; up to 2500 10% discount; above 2500 20% discount.
- 3% discount for union contributions.
- "FGTS" insurance: 11% however it is not deducted from the salary, but deposited in a different account by the company.
Afterwards, calculate the net salary by asking the user:
- Value of your hours worked and number of hours worked.
Print the following information on the screen:
Gross salary = ;
(-) Government tax IR (%) = ;
(-) Union (%) = ;
(FGTS DEPOSITED) (%) = ;
Total discounts = ;
Net salary = .
 */


package controlStructures;
import java.util.Scanner;
public class PayrollCalculation {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Write the value of the worked hour: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Write the number of hours worked: ");
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
		
		System.out.println("\nGross Salary = " + salarioBruto+ ";");
		
		if (salarioBruto <=900) {
		System.out.println("    (-) Government tax IR  (" + ir+"%) = EXEMPT;");
		} else {
		System.out.println("    (-) Government tax IR  (" + ir+ "%) = " + descontoIr+ ";");
		}
		
		System.out.println("    (-) Union contribution (3%)= " + sindicato+ ";");
		System.out.println("    FGTS Deposited (11%)= " + fgts + ";");
		System.out.println("\nTotal discounts = "+ descontos + ";");
		System.out.println("****NET SALARY = "+ salarioLiq + " *****.");

	}
}
