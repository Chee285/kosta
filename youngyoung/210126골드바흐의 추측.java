import java.util.Scanner;

//https://www.acmicpc.net/problem/6588
// 골드바흐의 추측
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 1000000;
		boolean[]isPrime = new boolean[max+1];
		for(int i=2; i<=max; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i<=max; i++) {
			for(int j=i*2; j<=max; j+=i) {
				if(!isPrime[j]) {
					continue;
				}
				isPrime[j] = false;
			}
		}
		
		while(true) {
			int n = sc.nextInt();
			boolean ok = false;
			if(n ==0) {
				break;
			}
			for(int i=2; i<=n/2; i++) {
				if(isPrime[i] && isPrime[n-i]) {
					System.out.println(n + "=" + i+" + "+(n-i));
					ok = true;
					break;							
				}
			}
			if(!ok) {
				System.out.println("Goldbeah's conjecture is worng");
			}
		}
	
	}

}