package com.demo.service;

public class MyGraph {
	MyLinkList [] graph;
	
	public MyGraph(int v) {
		this.graph=new MyLinkList[v];
		for(int i=0;i<this.graph.length;i++) {
			graph[i]=new MyLinkList();
		}
	}
	public void addEdge(int source,int dest) {
		graph[source].addNode(dest);
		
	}
	public void printGraph() {
		for(int i=0;i<graph.length;i++) {
			System.out.println(i+"----->");
			graph[i].displayList();
		}
	}
	
	public void dfsTraversal (int start) {
		System.out.println("Dfs Traversal");
		boolean [] visited= new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			visited[i]=false;
			
		}
		MyStackLinkList<Integer> st= new MyStackLinkList<Integer>();
		st.push(start);
		String dfs="";
		while(!st.isEmpty()) {
			int v= st.pop();
			if(!visited[v] ){
				dfs += v+",";
				visited[v]=true;
				int[] arr= new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i]=-1;
				}
				graph[v].getAdjacentNode(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						st.push(arr[i]);
					}
				}
				
				
			}
			System.out.println(dfs);
		}
	}
	
	
	public void bfsTraversal (int start) {
		System.out.println("bfs Traversal");
		boolean [] visited= new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			visited[i]=false;
			
		}
		MyQueueLinkList queue = new MyQueueLinkList();
		queue.enQueue(start);
		String bfs="";
		while(!queue.isEmpty()) {
			int v= queue.deQueue();
			if(!visited[v] ){
				bfs += v+",";
				visited[v]=true;
				int[] arr= new int[graph.length];
				for(int i=0;i<graph.length;i++) {
					arr[i]=-1;
				}
				graph[v].getAdjacentNode(arr);
				for(int i=0;i<graph.length;i++) {
					if(arr[i]!=-1 && !visited[arr[i]]) {
						queue.enQueue(arr[i]);
					}
				}
				
				
			}
			System.out.println(bfs);
		}
	}
	
}
