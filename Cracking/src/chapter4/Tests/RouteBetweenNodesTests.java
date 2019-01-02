package chapter4.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter4.RouteBetweenNodes;
import chapter4.SimpleGraph;
import chapter4.Node;

public class RouteBetweenNodesTests {

	@Test
	public void test() {
		// Create a graph
		SimpleGraph sG = new SimpleGraph();
		sG.nodes = new Node[8];

		// Creating the graph and initializing nodes
		sG.nodes[0] = new Node();
		sG.nodes[0].name = "1";
		
		sG.nodes[1] = new Node();
		sG.nodes[1].name = "2";
		
		sG.nodes[2] = new Node();
		sG.nodes[2].name = "3";
		
		sG.nodes[3] = new Node();
		sG.nodes[3].name = "4";
		
		sG.nodes[4] = new Node();
		sG.nodes[4].name = "5";
		
		sG.nodes[5] = new Node();
		sG.nodes[5].name = "6";
		
		sG.nodes[6] = new Node();
		sG.nodes[6].name = "7";
		
		sG.nodes[7] = new Node();
		sG.nodes[7].name = "8";
		
		// creating the neighbors of nodes
		sG.nodes[0].neighbors = new Node[1];  // 1 -> 7
		sG.nodes[0].neighbors[0] = sG.nodes[6];
		
		sG.nodes[1].neighbors = new Node[1];
		sG.nodes[1].neighbors[0] = sG.nodes[5]; // 2 -> 6
		
		sG.nodes[2].neighbors = new Node[2];
		sG.nodes[2].neighbors[0] = sG.nodes[4]; // 3 -> 5
		sG.nodes[2].neighbors[1] = sG.nodes[0]; // 3 -> 1
		
		sG.nodes[3].neighbors = new Node[1]; 
		sG.nodes[3].neighbors[0] = sG.nodes[5]; // 4 -> 6
		
		sG.nodes[4].neighbors = new Node[2];
		sG.nodes[4].neighbors[0] = sG.nodes[3]; // 5 -> 4
		sG.nodes[4].neighbors[1] = sG.nodes[1]; // 5 -> 2
		
		sG.nodes[5].neighbors = new Node[1];
		sG.nodes[5].neighbors[0] = sG.nodes[7]; // 6 -> 8
		
		sG.nodes[6].neighbors = new Node[2];
		sG.nodes[6].neighbors[0] = sG.nodes[1]; // 7 -> 2
		sG.nodes[6].neighbors[1] = sG.nodes[7]; // 7 -> 8
		
		
		RouteBetweenNodes rBN = new RouteBetweenNodes();
		assertTrue(rBN.routeBetweenNodes(sG.nodes[2], "8"));
		
	}
	
	@Test
	public void test2() {
		// Create a graph
		SimpleGraph sG = new SimpleGraph();
		sG.nodes = new Node[8];

		// Creating the graph and initializing nodes
		sG.nodes[0] = new Node();
		sG.nodes[0].name = "1";
		
		sG.nodes[1] = new Node();
		sG.nodes[1].name = "2";
		
		sG.nodes[2] = new Node();
		sG.nodes[2].name = "3";
		
		sG.nodes[3] = new Node();
		sG.nodes[3].name = "4";
		
		sG.nodes[4] = new Node();
		sG.nodes[4].name = "5";
		
		sG.nodes[5] = new Node();
		sG.nodes[5].name = "6";
		
		sG.nodes[6] = new Node();
		sG.nodes[6].name = "7";
		
		sG.nodes[7] = new Node();
		sG.nodes[7].name = "8";
		
		// creating the neighbors of nodes
		sG.nodes[0].neighbors = new Node[1];  // 1 -> 7
		sG.nodes[0].neighbors[0] = sG.nodes[6];
		
		sG.nodes[1].neighbors = new Node[1];
		sG.nodes[1].neighbors[0] = sG.nodes[5]; // 2 -> 6
		
		sG.nodes[2].neighbors = new Node[2];
		sG.nodes[2].neighbors[0] = sG.nodes[4]; // 3 -> 5
		sG.nodes[2].neighbors[1] = sG.nodes[0]; // 3 -> 1
		
		sG.nodes[3].neighbors = new Node[1]; 
		sG.nodes[3].neighbors[0] = sG.nodes[5]; // 4 -> 6
		
		sG.nodes[4].neighbors = new Node[2];
		sG.nodes[4].neighbors[0] = sG.nodes[3]; // 5 -> 4
		sG.nodes[4].neighbors[1] = sG.nodes[1]; // 5 -> 2
		
		sG.nodes[5].neighbors = new Node[1];
		sG.nodes[5].neighbors[0] = sG.nodes[7]; // 6 -> 8
		
		sG.nodes[6].neighbors = new Node[2];
		sG.nodes[6].neighbors[0] = sG.nodes[1]; // 7 -> 2
		sG.nodes[6].neighbors[1] = sG.nodes[7]; // 7 -> 8
		
		sG.nodes[7].neighbors = new Node[0]; // 8 empty neighbors
		
		
		RouteBetweenNodes rBN = new RouteBetweenNodes();
		assertFalse(rBN.routeBetweenNodes(sG.nodes[3], "5"));
		
	}

}
