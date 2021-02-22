import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1292
// 쉽게 푸는 문제
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1001];
		int num =1;
		int cnt = 0;
		for( int i=0; i<1000; i++) {
			arr[i] = num;
			cnt ++;
			if(num == cnt) {
				num ++;
				cnt=0;
			}
		}
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum =0;
		for(int i=num1 -1; i<=num2 -1; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}
}