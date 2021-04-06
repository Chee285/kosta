import java.util.Scanner;

// https://www.acmicpc.net/problem/10707
// 수도요금
public class Main {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int P = sc.nextInt();
		
		int X = P*A;
		int Y = 0;
		
		if(P<=C) {
			Y = B;
		}else {
			Y = B+ (P-C)*D;
		}
		if(X>Y) System.out.println(Y);
		else System.out.println(X);
		
	}
	
}
