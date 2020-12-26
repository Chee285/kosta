import java.util.Scanner;
// https://codeup.kr/problem.php?id=1441
// 버블 정렬
// 서로 인접한 두원소를 검사하여 정렬하는 알고리즘
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt(); // 받을 숫자의 갯수
		int[] numArr = new int[cnt];
		for(int i=0; i<cnt; i++) { // 해당 숫자를 받아옵니다.
			numArr[i]  = sc.nextInt();
		}
		int temp=0;
		for(int i = 0; i<cnt; i++) {
			for(int j = 0; j<cnt-1 ; j++) {
				if(numArr[i]<numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		
		
		for(int k=0; k<cnt; k++) {
			System.out.println(numArr[k]);
		}
		
	}
}
