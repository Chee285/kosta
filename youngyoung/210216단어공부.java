import java.util.Scanner;

//https://www.acmicpc.net/problem/1157
//단어공부
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		char ch = '?';
		int max = -1;
		String a = sc.next();
		
		for(int i=0; i<a.length(); i++) {
			if('A' <=a.charAt(i) && a.charAt(i) <='Z') { // 대문자 범위
				arr[a.charAt(i)- 'A']++; // 배열 0부터 계산
			}else { // 소문자 범위
				arr[a.charAt(i) - 'a'] ++;
			}
		}
		
		for(int i =0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
		
	}
}