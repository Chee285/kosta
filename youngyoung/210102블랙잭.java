import java.util.Scanner;

//https://www.acmicpc.net/problem/2798
//블랙잭
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardNum = sc.nextInt();
		int limit = sc.nextInt();
		int[] numArr = new int[100];
		int sum = 0;
		int maxNum = 0;

		// 오픈된 번호를 저장합니다.
		for (int i = 0; i < cardNum; i++) {
			numArr[i] = sc.nextInt();
		}
		for (int i = 0; i < cardNum - 2; i++) {
			for (int j = i + 1; j < cardNum - 1; j++) {
				for (int k = j + 1; k < cardNum; k++) {
					sum = numArr[i] + numArr[j] + numArr[k];
					if (sum > maxNum && sum <= limit) {
						maxNum = sum;
					}
				}
			}
		}
		System.out.println(maxNum);
	}
}
