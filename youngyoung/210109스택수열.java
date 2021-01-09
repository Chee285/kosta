import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/1874
// 스택수열
public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int cnt =1;
		boolean check = true;
		StringBuilder result = new StringBuilder();
		int num = sc.nextInt();
		int[] arr = new int[num]; 
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
			
			if(check) {
				if(cnt<=arr[i]) {
					while(cnt<=arr[i]) {
						stack.push(cnt++);
						result.append("+ \n");
					}
				}
				if(stack.isEmpty()) {
					check=false;
				}
				else {
					while(stack.peek()>= arr[i]) {
						stack.pop();
						result.append("- \n");
						if(stack.isEmpty()) {
							break;
						}
					}
				}
			}
		}
		
		if(check) {
			System.out.println(result.toString());
		}else {
			
			System.out.println("NO");
		}
	}
}