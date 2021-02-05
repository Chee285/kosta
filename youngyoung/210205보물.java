import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1026
// 보물 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA =new int [n];
		int [] arrB = new int[n];
		for(int i =0; i< n; i++) {
			arrA[i] = sc.nextInt();
		}
		for(int i =0; i< n; i++) {
			arrB[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arrA[i] * arrB[n-1-i];
		}
		System.out.println(sum);
		
	}

}