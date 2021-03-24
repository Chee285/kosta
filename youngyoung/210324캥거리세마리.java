import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2965
// 캥거루 세마리
public class Main { 
	// (A<B<C)
	// (B-A) , (C-A)  더 큰쪽에 -1
	public static void main(String[] args) {
		int[] point = new int[3];
		Scanner sc = new Scanner(System.in);
		point[0] = sc.nextInt();
		point[1] = sc.nextInt();
		point[2] = sc.nextInt();
		
		Arrays.sort(point);
		if(point[2]-point[1] >=point[1] - point[0]) {
			System.out.println(point[2] - point[1] -1);
		}else {
			System.out.println(point[1] - point[0] -1);
		}
		
		
		
	}
}
