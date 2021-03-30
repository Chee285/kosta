import java.util.Scanner;

// https://www.acmicpc.net/problem/1919
// 애너그램 만들기
public class Main {
	// 총 대문자의 개수는 26개
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		int[] Falpha=  new int[26];
		int[] Salpha= new int[26];
		int cnt= 0;
		
		for(int i=0; i<first.length(); i++) {
			Falpha[first.charAt(i) -'a']++;
		}
		for(int i=0; i<second.length();i++) {
			Salpha [second.charAt(i)-'a']++;
		}
		for(int i=0; i<26; i++) {
			cnt += Math.abs(Falpha[i]-Salpha[i]);
		}
		System.out.println(cnt);
		
	}
}