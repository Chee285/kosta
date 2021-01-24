import java.util.Scanner;

// https://www.acmicpc.net/problem/2609
// 최대광약수와 최소공배수
public class Main {

	private static int func(int a, int b) {
		if(b ==0) {
			return a;
		}
		
		return func (b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcm =  func(a,b);// 최대 공약수
		int lcm = a*b/gcm; // 최대 공배수
		
		System.out.println(gcm);
		System.out.println(lcm);
		
	}

}