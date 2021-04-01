import java.util.Scanner;

// https://www.acmicpc.net/problem/10808
// 알파벳 갯수 세기
public class Main { 
	static boolean[] prime = new boolean [246913];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] num = new int[26];
		for(int i=0; i<S.length(); i++) {			
			num[(int)S.charAt(i)-97] +=1;
		}
		for(int i=0; i<26; i++) {
			System.out.print(num[i]+ " ");
		}
	}
	
}
