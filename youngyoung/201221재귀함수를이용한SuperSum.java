import java.util.Scanner;

public class Main {
	
	private static int func(int k, int n) {
		if(k ==0) {
			return n;
		}
		int result=0;
		for(int i=0; i<n+1; i++) {
			result+=func(k-1,i);
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		// n(k-1 , n)
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) { // 입력이 없을때 까지 실행  EOF ( end of file)
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(func(k,n));
		}

	}
}
/*
 * input 예시
 * 1 3
 * 2 3
 * 4 10
 * 10 10
 * 
 * output answer
 * 6
 * 10
 * 2002
 * 167960
 */
