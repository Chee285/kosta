import java.util.Scanner;

//https://www.acmicpc.net/problem/2231
//분해합
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		int result =0;
		for(int i=0; i<num; i++) {
			int sum =0;
			int number =i;
			
			while(number!=0) {
				sum += number %10;
				number /= 10;
			}
			
			if(sum+i == num) {
				result =i;
				break;
			}
		}
		System.out.println(result);
	}
}
