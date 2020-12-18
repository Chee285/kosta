
import java.util.Scanner;

public class Main {
	
	
	private static void dfs(int num) {
		if(num <1) {
			return;
		}
		else {
			dfs(num-1);
			System.out.println(num);
		}
		
	}
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		dfs(num);
		
	}
}


