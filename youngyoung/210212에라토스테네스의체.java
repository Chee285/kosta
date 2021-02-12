import java.io.*;

// https://www.acmicpc.net/problem/2884
// 알람시계
import java.util.*;

// https://www.acmicpc.net/problem/2960
// 에라토스테네스의 체
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0 ;
		boolean[] arr = new boolean[n+1];
		
		for(int i=2; i<=n;i++) {
			arr[i] = true;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j = i; j<=n; j+=i) {
				if(!arr[j]) {
					continue;
				}
				arr[j] = false;
				cnt++;
				if(cnt==k) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
		

	}
}