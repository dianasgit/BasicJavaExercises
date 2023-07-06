/* 
 * create a code that contains a 3x3 matrix where each element is 
 * the sum of its respective index. 
 * Print each index;
 * Print the sum of all matrix elements;
 * Print the sum of all even and odd elements separately.
 * 
 */



package matrix;

public class ThreeDimensionalMatrix {

	public static void main(String[] args) {

		int [] [] [] matrixThree = new int[3] [3] [3];
		
		
		for (int i=0  ; i<matrixThree.length  ; i++) {
			for (int j=0  ; j<matrixThree[i].length  ; j++ ) {
				for (int k =0  ; k<matrixThree[i][j].length ; k++) {
					System.out.println("i= "+i+ "  --  j= "+ j+ "  --  k= "+k);
					matrixThree[i][j][k] = i + j + k;
				}
			}
		}
		
		int sumMatrix =0;
		int sumOdd =0;
		int sumEven =0;
		
		for (int i=0 ; i<matrixThree.length ;  i++ ) {
			for (int j=0; j<matrixThree[i].length ; j++ ) {
				for (int k=0  ; k<matrixThree[i][j].length  ; k++) {
					
					sumMatrix += matrixThree[i][j][k];
					
					if (matrixThree[i][j][k]%2 ==0) {
						sumEven += matrixThree[i][j][k];
					} else {
						sumOdd += matrixThree[i][j][k];
					}
					
				}
			}
		}
		
		
		System.out.println("The total sum of the matrix =  " + sumMatrix );
		
		System.out.println("\nThe total sum of Odd elements is =  " + sumOdd);
		
		System.out.println("\nThe total sum of even elements is =  " + sumEven);
		
	}
}