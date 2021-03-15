import java.util.Scanner;

//https://www.acmicpc.net/problem/1009
//분산처리
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a =0; 
		int b =0;
		int result = 0;
		
		
		
		for(int i=0; i<T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result = 1;
			
			for(int j =0; j<b; j++) {
				result = (result*a)%10;
			}
			if(result==0) {
				result=10;
			}
			System.out.println(result);
		}
	}
	
}
