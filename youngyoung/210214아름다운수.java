import java.io.IOException;
import java.util.Scanner;
//https://www.acmicpc.net/problem/2774
//아름다운 수
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int X = sc.nextInt();
			boolean[] arr = new boolean[10];
			while(X!=0) {
				arr[X%10] = true;
				X/=10;
			}
			int cnt = 0;
			for(int j=0; j<10; j++) {
				if(arr[j]) {
					cnt++;
				}
				
			}
			System.out.println(cnt);
			
		}
		
		
	}
}