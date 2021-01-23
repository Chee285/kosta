import java.util.Scanner;

// https://www.acmicpc.net/problem/10430
// 나머지
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fnum = sc.nextInt();
		int snum = sc.nextInt();
		int tnum = sc.nextInt();
		
		System.out.println((fnum+snum)%tnum);
		System.out.println(((fnum%tnum)+(snum%tnum))%tnum);
		System.out.println((fnum * snum)%tnum);
		System.out.println(((fnum%tnum)*(snum%tnum))%tnum);
		
	}

}