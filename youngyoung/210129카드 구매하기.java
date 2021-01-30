import java.util.Scanner;

// https://www.acmicpc.net/problem/11052
// 카드구매하기

// d[i] = p[n] + d[i-n]
// DP (다이나믹 프로그래밍문제)
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt(); // 내가 총 얻어야 할 카드에 갯수
		int [] cards = new int[num+1];
		int [] arr = new int[num+1];
		
		for(int i=1; i<= num; i++) {
			cards[i] = sc.nextInt();
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				arr[i] = Math.max(arr[i],arr[i-j] + cards[j]);
			}
			System.out.println(arr[i]);
		}
		
		System.out.println(arr[num]);
		sc.close();
	}

}