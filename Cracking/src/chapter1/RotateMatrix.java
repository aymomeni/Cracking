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
		int topLeft, topRight, bottomRight, bottomLeft;
		int lev = n/2;
		
		for(int level = 0; level < n/2; level++){
		
			for(int i = level; i < n-1-level; i++){
				
				topLeft = matrix[level][i]; 
				topRight = matrix[i][n-1-level]; 
				bottomRight = matrix[n-1-level][n-1-i]; 
				bottomLeft = matrix[n-1-i][level];
				
				matrix[level][i] = bottomLeft; // set topLeft to bottomLeft
				matrix[i][n-1-level] = topLeft; // set topRight to topLeft
				matrix[n-1-level][n-1-i] = topRight; // set bottomRight to topRight
				matrix[n-1-i][level] = bottomRight; // set bottomLeft to bottomRight
			}
			
		}
		
//		for(int i = 0; i < matrix.length; i++){
//			for(int j = 0; j < matrix.length; j++){
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		return matrix;
	}
	
	
}
