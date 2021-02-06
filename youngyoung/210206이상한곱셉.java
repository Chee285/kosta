import java.util.Scanner;

// https://www.acmicpc.net/problem/1225
// 이상한 곱셉
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next(); 
		
		long sum=0;
		
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<b.length(); j++) {
				sum += Integer.parseInt(a.charAt(i)+"") *Integer.parseInt(b.charAt(j)+"");
			}
		}
		System.out.println(sum);
	}

}