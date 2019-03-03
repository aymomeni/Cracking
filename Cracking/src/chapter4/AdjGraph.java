package chapter4;

/*
 * Represents an Graph using an Adjacency Matrix
 */
public class AdjGraph {

	int[][] graph;
	public AdjGraph(int n){
		graph = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				graph[i][j] = 0;
			}
		}
	}
}
