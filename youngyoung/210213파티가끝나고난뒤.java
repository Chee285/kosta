import java.io.*;

// https://www.acmicpc.net/problem/2884
// 알람시계
import java.util.*;

// https://www.acmicpc.net/problem/2845
// 파티가 끝나고 난뒤
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int p = sc.nextInt();
		
		int people = m*p;
		for(int i=0; i<5; i++) {
			int tmp = sc.nextInt();
			System.out.print(tmp-people + " ");
		}
		
		
	}
}