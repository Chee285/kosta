import java.util.Scanner;
// https://www.acmicpc.net/problem/7568
// 덩치
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int[][] arr = new int[num][2];
		for(int i=0; i<num; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int j =0; j<num; j++) {
			int cnt =1;
			for(int k=0; k<num; k++) {
				if(arr[j][0] < arr[k][0] && arr[j][1] <arr[k][1]) {
					cnt++;
				}
			}
			System.out.print(cnt +" ");
		}
	}
}
