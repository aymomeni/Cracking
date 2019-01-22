package chapter4;

public class GraphBuildOrder {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][];
	private int nVerts;
	private char sortedArray[];
	
	public GraphBuildOrder(){
		vertexList = new Vertex[MAX_VERTS];
		
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		
		for(int i = 0; i < MAX_VERTS; i++){
			for(int j = 0; j < MAX_VERTS; j++){
				adjMat[i][j] = 0; // initializing adj matrix
			}
		}
		sortedArray = new char[MAX_VERTS];
	}
	
	public void addVertex(char lab){
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
	}
	
	public char[] topo(){
		//int orig_nVerts = nVerts;
		
		while(nVerts > 0){
			// get vertex with no successors
			int currentVertex = noSuccessors();
			
			if(currentVertex == -1){
				System.out.println("Error: Graph is cyclic");
				return null;
			}
			// insert into sorted array
			sortedArray[nVerts-1] = vertexList[currentVertex].label;
			deleteVertex(currentVertex);
		}
		
//		System.out.println("Toplogically Sorted Order");
//		
//		for(int i=0; i < orig_nVerts; i++){
//			System.out.println(sortedArray[i] + " ");
//		}
		return sortedArray;
	}
	
	// deleting is setting the row and column to -1
	public void deleteVertex(int delVert){
		
		if(delVert != nVerts-1){
			for(int j = delVert; j < nVerts-1; j++){
				vertexList[j] = vertexList[j+1];
			}
			for(int row = delVert; row < nVerts-1; row++){
				moveRowUp(row, nVerts);
			}
			for(int col=delVert; col<nVerts-1; col++){
				moveColLeft(col, nVerts-1);
			}
		}

		nVerts--;
	}
	
	private int noSuccessors(){
		boolean isEdge;
		
		for(int row=0; row<nVerts; row++){
			isEdge = false;
			
			for(int col=0; col<nVerts;col++){
				if(adjMat[row][col] > 0){
					isEdge = true;
					break;
				} else if(adjMat[row][col] == row*-1){
					continue;
				}
			}
			if(!isEdge){
				return row;
			}
		}
		return -1;
	}
	
	
	private void moveRowUp(int row, int length){
		for(int col = 0; col<length; col++){
			adjMat[row][col]=adjMat[row+1][col];
		}
	}
	
	private void moveColLeft(int col, int length){
		for(int row=0; row<length; row++){
			adjMat[row][col]=adjMat[row][col+1];
		}
	}	
	
}

class Vertex {
	public char label;
	public Vertex(char lab){
		label = lab;
	}
}