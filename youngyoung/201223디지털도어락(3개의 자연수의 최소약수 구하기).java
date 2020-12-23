import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 디지털 도어락
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int min = 0;
		
		for(int i=1; i<1000; i++) {
			if(a % i ==0 && b%i ==0 && c%i==0) {
				if(min<i) {
					min = i;
				}
			}
		}
		System.out.println( min);
	}
}
