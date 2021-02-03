import java.util.Scanner;

// https://www.acmicpc.net/problem/2003
// 수들의 합 2
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int m =sc.nextInt();
		int[] arr= new int[num];
		
		for( int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i =0; i<num; i++) {
			int sum =0;
			for(int j = i; j<num; j++) {
				sum += arr[j];
				if(sum==m) {
				cnt++;
				break;
				}
			}
		}
		System.out.println(cnt);
	}


}