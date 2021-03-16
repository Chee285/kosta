import java.util.Scanner;

// https://www.acmicpc.net/problem/3085
// 사탕게임
// 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y
public class Main {
	static int  check(char[][] candy){
		int num = candy.length;
		int ans = 1;
		for(int i=0; i<num; i++) {
			int cnt =1;
			for(int j=1; j<num; j++){
				if(candy[i][j] == candy[i][j-1]) {
					cnt +=1;
				}else {
					cnt =1;
				}
				
				if(ans<cnt) {
					ans = cnt;
				}
			}
			cnt =1;
			for(int j=1; j<num; j++){
				if(candy[j][i] == candy[j-1][i]) {
					cnt +=1;
				}else {
					cnt =1;
				}
				if(ans < cnt) {
					ans = cnt;
				}
			}
		}
		return ans;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //  최대로 먹을수 있는 사탕수
		char[][] candy =new char[num][num];
		for(int i=0; i<num; i++) {
			candy[i] = sc.next().toCharArray();
		}
		
		int ans = 0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				//
				if( j+1 < num) {
					char t = candy[i][j];
					candy[i][j] = candy[i][j+1];
					candy[i][j +1]=t;
					int temp = check(candy);
					if(ans<temp) {
						ans = temp;
					}
					t = candy[i][j];
					candy[i][j] = candy[i][j+1];
					candy[i][j+1] = t;
				}
				
				if(i+1 <num) {
					char t = candy[i][j];
					candy[i][j] = candy[i+1][j];
					candy[i+1][j] = t;
					int temp = check(candy);
					if(ans< temp) {
						ans = temp;
					}
					t = candy[i][j];
					candy[i][j] = candy[i+1][j];
					candy[i+1][j] = t;
				}
			}
		}
		System.out.println(ans);
	}
	
}
