import java.util.Scanner;

// https://www.acmicpc.net/problem/8979
// 올림픽
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	contry = sc.nextInt();
		int iseerank = sc.nextInt();
		int rank =  1;
		int[][] arr = new int[contry][4];
		long[][] score = new long[contry][2];
		
		// 모든 나라의 메달개수를 카운트함
		for(int i  = 0; i< contry; i++) {
			for(int j = 0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 메달의 가중치를 부여하여서 계산
		for(int i=0; i<contry; i++) {
			score[i][0] = arr[i][0];
			score[i][1]= (arr[i][1]*1000000000000L) + (arr[i][2]*1000000) + (arr[i][3]*1);
		}
		
		
		// 알고싶은 국가에 대한 등수 
		for(int i=0; i<contry; i++) {
			if(score[i][0] == iseerank) {
				for(int j =0; j<contry; j++){
					if(score[i][1] < score[j][1]) {
						rank++;
					}
				}
			}
		}
		System.out.println(rank);
	}
}