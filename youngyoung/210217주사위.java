import java.util.Scanner;

//https://www.acmicpc.net/problem/1233
//주사위
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String room = sc.next();
		
		int size = room.length();
		int[] arr = new int[10];
		int temp =0;
		int max =0;
		
		for(int i=0; i<size; i++) {
			temp = room.charAt(i) -'0';
			arr[temp]++;
		}
		
		// 6,9 같은 숫자
		int k = (arr[6] + arr[9]);
		//k가 짝수일경우
		if(k%2 ==0) {
			arr[6]= k/2;
			arr[9] = k/2;
		}
		
		// k가 홀수일경우
		else {
			arr[6] = k/2+1;
			arr[9] = k/2+1;
		}
		
		for(int i: arr) {
			max = Math.max(max, i);
		}
		 
		System.out.println(max);
		
		
	}
}