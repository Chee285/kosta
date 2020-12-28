import java.util.Scanner;
// https://codeup.kr/problem.php?id=1442
// 선택 정렬
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numbers = new int[num];
		for(int i=0 ; i<num; i++) {
			numbers [i] = sc.nextInt();
		}
		int temp=0;
		for(int i =0; i<num-1; i++) {
			for(int j =i+1; j<num; j++) {
				if(numbers[i]>numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		
		for(int k =0; k<num; k++) {
			System.out.println(numbers[k]);
		}
		
			
		
	}
}
