import java.util.Scanner;
// https://codeup.kr/problem.php?id=1805
// 구조체 연습 - 입체기동장치 생산고장
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 장치에 대한 일련번호를 배열로 미리 생성해준다.
		int[] structure = new int[101];
		
		int order=0 , gas=0;
		
		// 일련번호에 맞게 gas를 넣어준다.
		// 하지만 0에 대한 예외처리를 위해서 임시의 +1를 시켜주고 출력할때 -1시켜준다.
		for(int i=0; i<num; i++) {
			order = sc.nextInt();
			gas = sc.nextInt();
			structure[order] = gas+1;
		} 
		
		// 출력 반복문입니다.
		for(int j = 1; j<=100; j++) {
			if(structure[j] != 0) {
				int realGas = structure[j] -1;
				System.out.println(j +" " +realGas);
			}
			
		}
		
	}
}
