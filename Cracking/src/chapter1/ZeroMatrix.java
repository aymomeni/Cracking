package chapter1;

import java.util.HashSet;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * it's entire row and column are set to 0
 * @author Momeni
 *
 */
public class ZeroMatrix {

	public int[][] zeroMatrix(int[][] matrix){
		
		HashSet<Integer> columnSet = new HashSet<Integer>();
        boolean overwrite = false;
		int rowLength = matrix[0].length;
		int columnLength = matrix.length;
		
		for(int i = 0; i < columnLength; i++){
			
			for(int j = 0; j < rowLength; j++){
				
				if(matrix[i][j] == 0){
					columnSet.add(j);
					overwrite = true;	
				}
			}
            
            if(overwrite){
                for(int w = 0; w < rowLength; w++){
					matrix[i][w] = 0;
				}
                overwrite = false;
            }
		}
		
			
		for(int j = 0; j < rowLength; j++){
			if(columnSet.contains(j)){
				for(int i = 0; i < columnLength; i++){
					matrix[i][j] = 0;
				}
			}
		}
		
		
		
		return matrix;
	}
}
