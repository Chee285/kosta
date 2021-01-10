import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/1427
// 소트인사이드
public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int size = num.length();
		char[] arr = new char[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = num.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for(int j=size-1; j>=0; j--) {
			System.out.print(arr[j]);
		}
	}
}