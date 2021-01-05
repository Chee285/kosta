import java.util.Scanner;

//https://www.acmicpc.net/problem/4344
//평균은 넘겠지
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();// 데이터를 받을개수
		for (int i = 0; i <num; i++) {
			int subNum = sc.nextInt();
			int[] score = new int[subNum];
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < subNum; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			int avg = sum / subNum;

			for (int k = 0; k < subNum; k++) {
				if (avg < score[k]) {
					cnt++;
					
				}
			}

			System.out.printf("%.3f%%\n",(float)cnt / subNum * 100);
		}

	}
}
