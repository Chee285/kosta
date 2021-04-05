import java.util.Scanner;

// https://www.acmicpc.net/problem/5789
// 한다 안한다.
public class Main {
	static boolean[] prime = new boolean[246913];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt;
		for (int i = 0; i < num; i++) {
			cnt = 0;
			String str = sc.next();
			if(str.charAt(str.length()/2)  == str.charAt(str.length()/2-1)) {				
				System.out.println("Do-it");
			}else {				
				System.out.println("Do-it-Not");
			}

		}
	}
}