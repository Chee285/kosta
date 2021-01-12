import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1436
// 영화감독 숌
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int title = 666;
		int cnt =1;
		while(cnt != num) {
			title ++;
			if(String.valueOf(title).contains("666")) {
				cnt ++;
			}
		}
		System.out.println(title);
		
	}
}
