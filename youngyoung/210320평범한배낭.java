import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

// https://www.acmicpc.net/problem/12865
// 평번한 배낭
public class Main {
	static Integer[][] dp;
	static int[] w;
	static int[] v;

	private static int valueBack(int i, int k) {
		//범위를 벗어남
		if(i < 0) {
			return 0;
		}
		
		if(dp[i][k] == null) {
			// 현재 물건(i)을 추가로 못담는 경우, 이전 i값 탐색
			if(w[i] > k) {
				dp[i][k] = valueBack(i-1, k);
			}else { // 현재 물건(i)을 담을 수 있는 경우
				// 이전 i값과 이전 i값에 대한 k-w[i]의 값+ 현재 가치v[i]중 큰 값을 저장
				dp[i][k] = Math.max(valueBack(i-1,k),valueBack(i-1,k - w[i] )+ v[i]);
			}			
		}
		return dp[i][k];
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 물품의 수
		int k = sc.nextInt(); // 버틸수 있는 무게
		w = new int[n];
		v = new int[n];

		dp = new Integer[n][k + 1];

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		System.out.println(valueBack(n - 1, k));

	}

}
