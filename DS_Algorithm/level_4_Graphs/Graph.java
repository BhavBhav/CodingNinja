package level_4_Graphs;

import java.util.Scanner;

public class Graph {
	
	public static void printHelper(int edges[][] , int sv , boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		for (int i = 0;  i < edges.length;  i++) {
			boolean check = !visited[i];
			if(edges[sv][i] == 1 && check) {
				printHelper(edges, i, visited);
			}
		}
	}
	
	public static void print(int edges[][]) {
		boolean visited[]  = new boolean[edges.length];
		for (int i = 0; i < edges.length; i++) {
			if(!visited[i]) {
				printHelper(edges, i, visited);
			}
		}
		
	}

	
	public static void main(String[] args) {
		int n,e;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		e = s.nextInt();
		int edges[][] = new int[n][n];
		for(int i = 0; i < e; i++) {
			int fv = s.nextInt(); //fv = firstVertex
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		print(edges);
		s.close();
	}
}
