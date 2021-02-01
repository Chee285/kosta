import java.util.Scanner;

// https://www.acmicpc.net/problem/20361
// 일우는 야바위꾼
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cup = sc.nextInt();
		int ball = sc.nextInt();
		int k = sc.nextInt();
		
		boolean [] arr = new boolean[cup+1];
		arr[ball] = true;
		for(int i=0; i< k; i++) {
			int n =sc.nextInt();
			int m = sc.nextInt();
			boolean temp;
			temp = arr[n];
			arr[n] = arr[m];
			arr[m] = temp;
			
		}
		
		for(int i=1; i<cup+1; i++) {
			if(arr[i]) {
				System.out.println(i);
			}
		}
	}

}