import java.util.Scanner;

// https://www.acmicpc.net/problem/3059
// 등장하지 않는 문자의 합
public class Main {
	// 총 대문자의 개수는 26개
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			String alphaLine = sc.next();
			boolean[] alpha = new boolean[26];
			for(int j=0; j<alphaLine.length(); j++) {
				if(!alpha[alphaLine.charAt(j)-'A']) {
					alpha[alphaLine.charAt(j)-'A'] = true;
				}
			}
			int cnt=0;
			int S=0;
			for(int j=0; j<26; j++) {
				if(!alpha[j] ) {
					S+= j;
					cnt++;
				}
			}
			S +=cnt*65;
			System.out.println(S);
		}
	
	}
}