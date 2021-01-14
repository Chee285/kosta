import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/3052
// 나머지
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int num = sc.nextInt();
			arr[i]=num%42;
		}
		int cnt=0;
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[j] == arr[k]) {
					arr[k] =-1;
				}
				
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			if( arr[i]> -1) {
				cnt++;	
			}			
		}
		System.out.println(cnt);
		
	}
}
