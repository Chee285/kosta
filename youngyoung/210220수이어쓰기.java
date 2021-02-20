import java.util.Scanner;

// https://www.acmicpc.net/problem/1748
// 수 이어쓰기1
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1;
		int tmp = 0;
		int length =10;
		for( int i =1; i<=num; i++) {
			if(i ==length) {
				cnt++;
				length =length *10; 
			}
			tmp = tmp + cnt;
			
		}
		System.out.println(tmp);
		
		
	}
	

}