import java.util.Scanner;

// https://www.acmicpc.net/problem/1978
// 소수 찾기
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = num;

		for (int i = 0; i < num; i++) {
			int temp = sc.nextInt();
			if(temp==1) {
				cnt--;
			}
			for(int j=2; j<temp; j++) {
				if(temp%j ==0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}