import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/8958
//	OX퀴즈
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		for(int i =0; i<num; i++) {
			arr[i] = sc.next();
			int sum = 0;
			int cnt  =1;
			for(int j = 0; j<arr[i].length(); j++) {
				if('O' == arr[i].charAt(j)) {
					sum+= cnt;
					cnt++;
				}else {
					cnt =1;
				}
			}
			
			System.out.println(sum);
		}
		
	}
}