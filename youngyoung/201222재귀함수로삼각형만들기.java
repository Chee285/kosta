import java.util.Scanner;

public class Main {
	
	private static void func(int num, int start, int end) {
		if(start == num) {
			return;
		}else {
			if(start == end) {
				start =0;
				end+=1;
				System.out.println();
			}
			System.out.print("*");
			func(num, start+1, end);
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		func(num, 0,1);
	}
}
/*
 * 재귀함수를 통해서 삼각형을 만드는 문제입니다.
 * input 3
 * output
 * *
 * **
 * ***
 * 
 * 위와 같은 결과가 출력됩니다.
 */
*/
