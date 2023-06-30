package controlStructures;

public class ForLoops {

	public static void main(String[] args) {

		
	// #### THE MOST SIMPLE FOR COUNTER FROM 0 TO 4 and from 7 to 1.
		for (int i=0 ; i<5 ; i++) {
		System.out.println("i= " +i);
		}
	
		for (int i=7 ; i>0 ; i--) {
			System.out.println("i= " +i);
		}
	
	// ### FOR with more then one variable, just separate with , 
		for (int i=0 , j=10  ;  i<j  ;  i++ , j--) {
			System.out.println("i= " +i + " e j= "+j);
		}
	
	// ### FOR with empity initialization ou loop increment.. 
	// do not represent improvement in the code because you need to declare this values out of the FOR anyway...
	
		int count = 0;
		for (; count <10;) {
			System.out.println(count);
			count += 2;
		}
		
	//loop FOR for simple sums 
	// NOTE, in this case I used a ; in the end of if()... it make the sistem finish all the true loop before stop in the condition and print only the final value... if I do not use the ; in the end of the if() it will print each step os the summation. 	
		int soma = 0;
		for(int i=1 ; i<5 ; soma += i++); {
		System.out.println("Soma= "+ soma);
		System.out.println("commit ok");
		}
		
		// the {} is not obligatory to the code works.. but it is good practices 
		
		
		
		
		
		
	}
}