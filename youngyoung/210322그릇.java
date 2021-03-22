import java.util.Scanner;

// https://www.acmicpc.net/problem/7567
// 그릇
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s1 = sc.nextLine().toCharArray();
		char temp = 0;
		int cnt=0;
		for(int i=0; i<s1.length; i++) {
			if(temp ==s1[i]) {
				cnt +=5;
			}else {
				cnt+=10;
			}
			temp =  s1[i];
			
		}
		System.out.println(cnt);
		
	}
}
