import java.util.Scanner;

// https://www.acmicpc.net/problem/1747
// 소수 & 팰린드롬
public class Main {

	// 소수
	private static boolean primeNumber(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	// 대칭되는 문자가 일치하는지 확인
	private static boolean isPalindrome(int n) {
		char[] arr = String.valueOf(n).toCharArray();
//		System.out.println(arr);
		int a = 0;
		int b = arr.length - 1; 

		while (a < b) {
			if (arr[a] != arr[b]) {
				return false;
			}
			a++; 
			b--;
		}
		return true;

	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (true) {
			if (primeNumber(num) && isPalindrome(num)) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}

}