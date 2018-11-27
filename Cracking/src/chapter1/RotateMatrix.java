package chapter1;

/**
 * Given an image represented by an NxN matrix, where each pixel
 * in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 * @author Momeni
 *
 */
public class RotateMatrix {

	
	public static int[][] rotate(int[][] matrix){
		
		int n = matrix.length;
		int temp1, temp2, temp3, temp4;
		int lev = n/2;
		
		for(int level = 0; level < n/2; level++){
		
			for(int i = 0; i < n-1; i++){
				
				temp1 = matrix[level][i];
				temp2 = matrix[i][n-1];
				temp3 = matrix[n-1][(n-1)-i];
				temp4 = matrix[n-1-i][level];
				
				matrix[0][i] = temp4;
				matrix[i][n-1] = temp1;
				matrix[n-1][n-1-i] = temp2;
				matrix[n-1-i][0] = temp3;
			}
			
		}
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		return matrix;
	}
	
	
}
