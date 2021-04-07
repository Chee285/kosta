import java.util.Scanner;

// https://www.acmicpc.net/problem/11050
// 이항 계수1
public class Main {
	// (a+b)n
	// n! / r!(n-r)!
	public static int BC(int N, int K) {
		if( N== K || K == 0) {
			return 1;
		}else {
			return BC(N-1, K-1) + BC(N-1,K);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(BC(N, K));
		
	}
}