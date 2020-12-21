import java.util.Scanner;

public class Main {
	static String result="1";
	private static String fun(int x) {
		int num = x/2;
		
		if(num!=1) {
			fun(num);
		}
		result+=String.valueOf(x%2);
		return result;
			
	}
	
	public static void main(String[] args) {
		// 정수를 입력받아서 이진법으로 변환하여라
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(fun(x));
	}
}