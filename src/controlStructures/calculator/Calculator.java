package controlStructures.calculator;

public class Calculator {

	public static long factorial(long num) {
		
		if (num ==0) {
			return 1;
		} 
		
		long result = 1;
		
		for (long i = num ; i>1 ; i--) {
			result *= i;
		}
		
		return result;
	}
	
}