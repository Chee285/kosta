import java.util.Scanner;
//https://www.acmicpc.net/problem/1712
//손익분개점
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		if(c <=b) {
			result =-1;
		}else {
			result = a/(c-b)+1;
		}
		System.out.println(result);
		
	}
}
