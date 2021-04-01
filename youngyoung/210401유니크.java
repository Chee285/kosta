import java.util.Scanner;

// https://www.acmicpc.net/problem/4948
// 베르트랑 공준
public class Main { 
	static boolean[] prime = new boolean [246913];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][]arr = new int[num][3];
		
		// 수 입력
		for(int i=0; i<num; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<3; j++) {
				boolean flag = false; 
				for(int k=0; k<num; k++) {
					if(i!=k && arr[i][j] == arr[k][j]) {
						arr[k][j] =0;
						flag = true;
					}
				}
				if(flag) {
					arr[i][j] = 0;
				}
				
				
			}
			System.out.println(arr[i][0] + arr[i][1]+arr[i][2]);
		}
		
	}
	
}
