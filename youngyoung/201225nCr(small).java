import java.util.Scanner;
// https://codeup.kr/problem.php?id=1925
public class Main {
	static int result=1;
	static int imm=1;
	private static int fact(int n, int r) {
		if(r ==0 || n ==r) {
			return 1;
		}else {
			return fact(n-1,r-1) + fact(n-1,r);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(fact(n,r));
		
	}
}
