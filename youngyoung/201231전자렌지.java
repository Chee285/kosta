import java.util.Scanner;
//https://codeup.kr/problem.php?id=4816
//전자렌지
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 300;
		int b = 60;
		int c= 10;
		int result1,result2,result3;
		int imm =0;
		int T = sc.nextInt();
		imm = T%a;
		result1 = T/a;
		
		result2 = imm/b;
		imm = imm%b;

		result3 = imm/c;
		imm = imm%c;

		if(imm !=0) {
			System.out.println(-1);
		}else {
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
		}
		
	}
}
