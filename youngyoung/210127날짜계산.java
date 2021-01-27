import java.util.Scanner;

// https://www.acmicpc.net/problem/1476
// 날짜계산
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt(); // max 15
		int S = sc.nextInt(); // max 28
		int M = sc.nextInt(); // max 19
		
		int cntE=1;
		int cntS=1;
		int cntM=1;
		
		for(int cnt =1;;cnt++) {
			
			if(cntE==E && cntS ==S && cntM==M) {
				System.out.println(cnt);
				break;
			}
			cntE++;
			cntS++;
			cntM++;

			if(cntE ==16) {
				cntE=1;
			}
			if(cntS==29) {
				cntS=1;
			}
			if(cntM==20) {
				cntM=1;
			}
			
			
		}
		
		
	}

}