import java.util.Scanner;

// https://www.acmicpc.net/problem/3049
// 다각형의 대각선
public class Main { 
	// 하나의 교차점을 만들기 위해서는 선분이 2개 필요
	// 선분 2개는 꼭지점 4개로 구성
	// 그러므로 n개의 꼭지점으로 구성된 블록 다각형은 하나의 교차점을 위해 5개의 꼭지점을 선택해야하므로 
	// nC4가 된다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((n * (n-1) * (n-2) * (n-3))/24);
	}
	
}
