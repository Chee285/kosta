import java.util.LinkedList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1966
// 프린터 큐
public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,m,cnt;
		for(int i=0; i<T; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			LinkedList<int[]> queue = new LinkedList<int[]>();
			cnt = 0;
			for(int j=0; j<n; j++) {
				queue.add(new int[] {j,sc.nextInt()});
			}
			// 인텍수, 중요도 입력
			while(!queue.isEmpty()) {
				int[] now = queue.poll();
				boolean able = true;
				for(int[] q : queue) {
					if(q[1] > now[1]) {
						able = false;
					}
				}
				if(able) {
					cnt++;
					if(now[0] == m) {
						break;
					}
				}else {
					queue.add(now);
				}
				
			}
			System.out.println(cnt);
		}
		
	}
}
