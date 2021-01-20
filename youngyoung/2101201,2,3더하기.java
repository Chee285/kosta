import java.util.Scanner;

// https://www.acmicpc.net/problem/9095
// 1,2,3더하기
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n;
		int[] output = new int[11];
		output[1] = 1;
		output[2] = 2;
		output[3] = 4;
		
		for(int i=0; i<num; i++) {
			n = sc.nextInt();
			for (int j =4; j<=n; j++) {
				output[j]  = output[j-1] + output[j-2] + output[j-3];
				
			}
			System.out.println(output[n]);
		}
	}

}