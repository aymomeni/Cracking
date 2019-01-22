package chapter4.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter4.GraphBuildOrder;

public class GraphBuildOrderTests {

	@Test
	public void test() {
		GraphBuildOrder g = new GraphBuildOrder();
		g.addVertex('A'); //0
		g.addVertex('B'); //1
		g.addVertex('C'); //2
		g.addVertex('D'); //3
		g.addVertex('E'); //4
		g.addVertex('F'); //5
		g.addVertex('G'); //6
		g.addVertex('H'); //7

		g.addEdge(0, 3); // A->D
		g.addEdge(0, 4); // A->E
		g.addEdge(1, 4); // B->E
		g.addEdge(2, 5); // C->F
		g.addEdge(3, 6); // D->G
		g.addEdge(4, 6); // E->G
		g.addEdge(5, 7); // F->H
		g.addEdge(6, 7); // G->H
		
		System.out.println("Got Here");
		char[] cArr = g.topo();
		
		for(int i = 0; i < cArr.length; i++){
			System.out.print(cArr[i]+ " ");
		}
	}

}
