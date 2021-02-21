import java.util.Scanner;

// https://www.acmicpc.net/problem/1546
// 평균(위조한평균)
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int num = sc.nextInt();
		double sum = 0;
		int max =0;
		double[] arr = new double[num];
		for(int i=0; i<num ; i++) {
			
			int a= sc.nextInt();
			if(a > max) {
				max = a;
			}
			arr[i]=a;
		}
		
		for( int i= 0; i<num; i++) {
			
			sum += arr[i]/max*100;
			
		}
		System.out.println(sum/num);
	}
}