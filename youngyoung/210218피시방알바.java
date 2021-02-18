import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1453
// 피시방 알바
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		boolean [] seat = new boolean[101];
		int cnt=0;
		for(int i =0; i<p; i++) {
			int num =sc.nextInt();
			if(!seat[num]) {
				seat[num] = true;
			}else {
				cnt++;
			}
			
		}
		sc.close();
		System.out.println(cnt);
	}
	

}