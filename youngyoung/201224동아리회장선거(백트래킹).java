import java.util.Scanner;
//https://codeup.kr/problem.php?id=2608
public class Main {
	static int num =0;
	static char[] ox = {'O', 'X'};
	static char[] str = new char[7];
	
	private static void func(int len, int i) {
		if(len == num -1) { // 입력한 수와 배열크기가 같은 경우
			str[len] = ox[i];
			System.out.println(str);
			return;
			
		}else {
			str[len] = ox[i];
			func(len+1,0);
			func(len+1,1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		func(0,0);
		func(0,1);
				
	}
}
