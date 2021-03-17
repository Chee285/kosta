import java.util.Scanner;

// https://www.acmicpc.net/problem/2920
// 음계
public class Main {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		
		String result = "" ;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1] -1) {
				result = "ascending";
			}else if ( arr[i] == arr[i+1]+1) {
				result = "descending";
			}else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
	
}
