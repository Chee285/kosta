import java.util.Scanner;

// https://www.acmicpc.net/problem/4948
// 베르트랑 공준
public class Main { 
	static boolean[] prime = new boolean [246913];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//소수 
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j < prime.length; j+= i) {
				prime[j] = true;				
			}
		}
		
		while(true) {			
			int n = sc.nextInt();
			if(n == 0)break;
			int cnt = 0; // 소수 갯수
			for(int i =n+1; i<=2*n; i++) {
				if(!prime[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
	
}
