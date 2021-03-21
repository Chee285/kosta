import java.util.Scanner;

// https://www.acmicpc.net/problem/2523
// 별 찍기 -13
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
		// 밑부분 별찍기
		for(int i=num-1; i>0; i--) {
			for(int j=i; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
