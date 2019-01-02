package chapter4;

import java.util.LinkedList;

public class RouteBetweenNodes {

	// approach some kind of BFS that in the end returns a list of
	// nodes visited to get a path from A->B or returns null otherwise
	public boolean routeBetweenNodes(Node root, String B){
		
		LinkedList<Node> queue = new LinkedList<Node>();
		root.marked = true;
		queue.addLast(root);
		
		while(!queue.isEmpty()){
			Node r = queue.removeFirst();;
			System.out.println(r.name); // visit()
			if(r.name.equals(B)){
				return true;
			}
			
			for(Node n : r.neighbors){
				if(n.marked == false){
					n.marked = true;
					queue.addLast(n);
				}
			}
		}	
		return false;
	}
	
	
}
