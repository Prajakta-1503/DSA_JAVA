package com.demo.test;
import java.util.*;
import com.demo.service.*;

public class TestAdjacencyLinkList {
	public static void main(String[] args) {
		System.out.println("How many Vertex You want??");
		Scanner sc = new Scanner(System.in);
		int v =sc.nextInt();
		MyGraph g = new MyGraph(v) ;
		storeGraph(g,v);
		g.printGraph();
		g.bfsTraversal(0);
		System.out.println("--------------------4");
		g.dfsTraversal(0);
		
		
	}

	private static void storeGraph(MyGraph g, int v) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("Is there any edge between"+i+"---------"+j);
				int val = sc.nextInt();
				if(val>0) {
					g.addEdge(i, j);
				}
				
			}
		}
	}

}
