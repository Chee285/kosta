import java.util.Scanner;

// https://www.acmicpc.net/problem/6603
// 로또

public class Main {
	static int num;
	static boolean[] result;
	static int[] arr;
	
	private static void DFS(int start, int depth) {
		if(depth ==6) {
			for(int i=0; i<num; i++) {
				if(result[i]) {
					System.out.print(arr[i] +" ");
				}
			}
			System.out.println();
		}
		for(int i=start; i< num; i++) {
			result[i] = true;
			DFS(i+1,depth+1);
			result[i] = false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			num = sc.nextInt();
			
			if(num ==0) {
				break;
			}
			
			arr=  new int[num];
			 result = new boolean[num];
			
			for(int i=0; i<num; i++) {
				arr[i] = sc.nextInt();
			}
			
			DFS(0,0);
			System.out.println();
			
		}
		
		
		
		
	}

}