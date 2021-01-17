import java.util.Scanner;
import java.util.Stack;


// https://www.acmicpc.net/problem/9093
// 단어 뒤집기
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = null;
		for(int i=0; i<num; i++) {
			String str = sc.nextLine();
			arr = str.split(" ");
			for(int j=0; j<arr.length; j++) {
				for(int k=arr[j].length()-1; k>=0; k--) {
					System.out.print(arr[j].charAt(k));
				}
				System.out.print(" ");
			}
			System.out.println();
					
		}
	}

}

---------------------------------------------------------------------------------------

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 

    	String str;
    	char[] stack;
    	int size;
    	
    	int num = sc.nextInt();
    	sc.nextLine();
    	while(num > 0) {
    		str = sc.nextLine() + "\n";
    		
    		stack = new char[str.length()];
    		size = 0;
    		
    		for(int i =0; i<str.length(); i++) {
    			if(str.charAt(i)== ' ' || str.charAt(i) == '\n') {
    				while(size >0) {
    					System.out.print(stack[size-1]);
    					size -=1;
    				}
    				System.out.print(str.charAt(i));
    			}else {
    				stack[size] =str.charAt(i);
    				size +=1;
    			}
    		}
    		num--;
    	}
    }
       
}