import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2309
// 입곱난쟁이
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 100;
		int size = 9;
		int sum=0;
		boolean check = false;
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			
		}
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(sum-(arr[i] + arr[j]) == max) {
					arr[i]=100;
					arr[j] = 100;
					check = true;
					break;
						
				}
				if(check) {
					break;
				}
			}
		}
		Arrays.sort(arr);
		
		for(int num : arr) {
			if(num !=100) {
				System.out.println(num);
			}
			
		}
		
	}

}