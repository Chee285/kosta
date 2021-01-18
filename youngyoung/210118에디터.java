import java.util.Scanner;
import java.util.Stack;
 
//https://www.acmicpc.net/problem/1406
// 에디터
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Stack<Character> lstack = new Stack<Character>(); 
    	Stack<Character> rstack = new Stack<Character>();
    	
    	String str = sc.next();
    	
    	for(int i=0; i<str.length(); i++) {
    		lstack.push(str.charAt(i));
    	}
    
    	int num = sc.nextInt();
    	
    	for( int i=0; i<num; i++) {
    		String com = sc.next();
    		
    		//왼쪽이동
    		if(com.startsWith("L")){
    			if(!lstack.empty()) {
    				rstack.push(lstack.pop());
    			}
    		//오른쪽 이동
    		}else if(com.startsWith("D")){
    			if(!rstack.empty()) {
    				lstack.push(rstack.pop());
    			}
    			
    		//커서 왼쪽 문자 삭제
    		}else if (com.startsWith("B")) {
    			if(!lstack.empty()) {
    				lstack.pop();
    			}
    		//커서 왼쪽 문자 추가
    		}else if(com.startsWith("P")) {
    			String text = sc.next();
    			
    			lstack.push(text.charAt(0));
    		}
    	}
    	
    	while(!lstack.empty()) {
    		rstack.push(lstack.pop());
    	}
    	while(!rstack.empty()) {
    		System.out.print(rstack.pop());
    	}
    }
       
}