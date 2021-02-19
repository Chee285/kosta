import java.util.Scanner;

// https://www.acmicpc.net/problem/1547
// 공
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean[] cup = new boolean[4];
		cup[1] = true;
		for(int i=0; i<num; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean tmp;
			tmp = cup[x];
			cup[x] = cup[y];
			cup[y] = tmp;
		}
		
		for(int i=1; i<4; i++) {
			if(cup[i]) {
				System.out.println(i);
			}
		}
	}
	

}