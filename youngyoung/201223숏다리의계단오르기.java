import java.util.Scanner;

public class Main {
	static int num =0;
	static int cnt = 0;
	private static void func(int sum, int stamina) {
		if(sum >num) {// 총합이 받은 숫자보다 크면 return
			return;
		}else if(sum == num) { // 총합이 받은 수랑 같으면 return;
			cnt++; // 조건 충족으로 경우의 수를 추가해준다.
			return;
		}
		
		if(stamina!=0) { // 3칸 오른경우 예외처리 해줍니다.
			func(sum+1, stamina-1);
			func(sum+2, stamina-1);
		}else {
			func(sum+1,0);
			func(sum+2,0);
			func(sum+3, 2);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 숏다리로 계단오르기
		 * 한번에 1 또는 2 또는 3칸을 오를수 있습니다.
		 * 하지만 한번에 3칸을 오르면 다음에는 힘이들어서 1또는 2칸 오를수 있다.
		 * 3칸을 2번 오를수 없다.
		 */
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); // 계단수
		int sum = 0, stamina=0;
		func(sum , stamina);
		
		
		System.out.print(cnt);
		
	}
}