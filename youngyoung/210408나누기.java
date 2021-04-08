import java.util.Scanner;

// https://www.acmicpc.net/problem/1075
// 나누기
public class Main {
	static boolean[] prime = new boolean[246913];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int F = sc.nextInt();
		while(true) {
			
			if(N%100 ==0) {
				break;
			}
			N -=1;
		}
		while(true) {
			if(N%F ==0) {
				break;
			}
			N+=1;
		}
		
		if(N %100<10) {
			System.out.print("0");
			System.out.println(N%100);
		}else {
			System.out.println(N%100);
		}
	}
}