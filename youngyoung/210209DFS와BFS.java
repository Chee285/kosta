import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1260
// DFS와 BFS
public class Main {
	private static int n;
	private static ArrayList<Integer>[] list;
//	private static int[] arr;
	private static boolean[] check;
	private static int m;
	private static int v;

	
	private static void dfs (int v) {
		if(check[v]) {
			return;
			
		}
		check[v] = true;
		System.out.print(v+" ");
		for(int y : list[v]) {
			if(!check[y]) {
				dfs(y);
			}
		}
	}
	
	
	private static void bfs(int v) {
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.add(v);
		check[v] = true;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			System.out.print(x+" ");
			for(int y : list[x]) {
				if(!check[y]) {
					check[y] = true;
					queue.add(y);
				}
			}
		}
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 정점의 개수
		m = sc.nextInt(); // 간선의 개수
		v = sc.nextInt(); // 탐색을 시작할 정점의 번호
		
		list = new ArrayList[n+1];
		for(int i=1; i<n+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=1; i<n+1; i++) {
			Collections.sort(list[i]);
		}
		check = new boolean [n+1];
		dfs(v);
		System.out.println();
		
		check = new boolean[n+1];
		bfs(v);
		System.out.println();
		
		sc.close();

		
	}

}