import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] box = new int[num][num];
		for(int x = 0; x<num; x++) {
			box[0][x]= sc.nextInt();
		} // 첫번째 입력받은 값들 먼저 저장
		
		for(int i =1; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j == num-1) {
					box[i][j] = box[i-1][0];
				}else {
					box[i][j] = box[i-1][j+1];
				}
				
			}
		} //  for 문을 이용해서 나머지 로테이션을 돌림
		
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(box[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
/*
* input
* 5
* 1 2 3 4 5 
* 
* 
* output
* 1 2 3 4 5 
* 2 3 4 5 1 
* 3 4 5 1 2 
* 4 5 1 2 3 
* 5 1 2 3 4 

*/