import java.util.Scanner;

public class Main {

	private static void fun(int x) {
		System.out.println(x);
		if(x != 1) {
			if(x%2 ==0) { // 짝수 일경우
				fun(x/2);
				
			}else {// 홀수 일경우
				
				fun(x*3+1);

			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * (재귀함수) 우박수 (3n+1)
		 * 1. 어떤 자연수  n이 입력되며,
		 * 2. n이 홀수 이면  3n + 1을 하고,
		 * 3. n이 짝수이면 n/2를 한다.
		 * 4. 이 n이 1이 될때까지 2 3 과정을 반복한다.		
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		fun(x);
	}
}
