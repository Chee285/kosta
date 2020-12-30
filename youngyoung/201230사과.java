import java.util.Scanner;
//https://codeup.kr/problem.php?id=4846
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] numArr = new int[num][2];
		int temp=0;
		for(int i =0; i<num; i++) {
			numArr[i][0] = sc.nextInt();
			numArr[i][1] = sc.nextInt();
			
		}
		int result =0;
		for(int j=0; j <num; j++) {
			
				result += numArr[j][1]%numArr[j][0];
		
		}
		System.out.println(result);
		
	}
}

