import java.util.Scanner;
import java.util.Stack;


//https://www.acmicpc.net/problem/10828
// 스택
public class Main {
	public static int[] stack;
	public static int size = 0;
	
	public static void push(int num) {
		stack[size] = num ;
		size++;
	}
	
	public static int pop() {
		if(size ==0) {
			return -1;
		}else {
			int num = stack[size-1];
			stack[size-1]=0;
			size--;
			return num;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size ==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int top() {
		if(size==0) {
			return-1;
		}else {
			return stack[size-1];
		}

	}
	
    public static void main(String[] args) {
    	Scanner sc  = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int num = sc.nextInt();
    			
    	stack = new int[num];
    	
    	for(int i=0; i<num; i++) {
    		String str = sc.next();
    		switch(str) {
    		case "push":
    			push(sc.nextInt());
    			break;
    		case "pop":
    			sb.append(pop()).append('\n');
    			break;
    		case "size":
    			sb.append(size()).append('\n');;
    			break;
    		case "empty":
    			sb.append(empty()).append('\n');;
    			break;
    		case "top":
    			sb.append(top()).append('\n');;
    			break;
    		}
    		
    	}
    	System.out.println(sb);
    }

}