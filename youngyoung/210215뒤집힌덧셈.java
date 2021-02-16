import java.io.IOException;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1357
//뒤집힌 덧셈
public class Main {
	
	public static String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String y = sc.next();
		
		int a = Integer.parseInt(reverseString(x));
		int b = Integer.parseInt(reverseString(y));

		System.out.println(Integer.parseInt(reverseString(Integer.toString(a+b))));
		
		
	}
}