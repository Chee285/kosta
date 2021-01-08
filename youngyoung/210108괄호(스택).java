import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/9012
// 괄호
public class Main {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		int isbreak=0;
		sc.nextLine();
		
		for(int i=0; i<num; i++) {
			String line = sc.nextLine();
			for(int j =0; j<line.length(); j++) {
				String temp = line.substring(j,j+1);
				if(temp.equals("(")){
					stack.add(temp);
				}else {
					//처음부터 닫는괄호에 대한 예외처리
					if(stack.empty()) {
						isbreak=1;
						System.out.println("NO");
						break;
					}else {
						stack.pop();
					}
				}
			}
			
			if(stack.empty() && isbreak ==0) {
				System.out.println("YES");
			}else {
				if(isbreak !=1) {
					System.out.println("NO");
				}
			}
			stack.clear();
			isbreak=0;
			
		}
	}
}