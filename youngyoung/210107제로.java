import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/10773
//제로(스택
public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		
		for(int i=0; i<num; i++) {
			int mon = sc.nextInt();
			if(mon == 0 && !stack.isEmpty()) {
				stack.pop();
			}else {
				stack.push(mon);
			}
			
		}
		
		while(!stack.isEmpty()) {
			sum+=(int)stack.pop();
			
			
		}
		System.out.println(sum);
		
		
	}
}
