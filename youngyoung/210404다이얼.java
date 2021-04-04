import java.util.Scanner;

// https://www.acmicpc.net/problem/5622
// 다이얼
public class Main { 
	static boolean[] prime = new boolean [246913];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String num = sc.nextLine();
		for(int i=0; i< num.length(); i++) {			
			char val = num.charAt(i);
			if(val < 68) cnt+=3;
			else if(val<71) cnt+=4;
			else if(val<74) cnt += 5;
			else if(val<77) cnt+=6;
			else if(val <80) cnt +=7;
			else if(val<84) cnt +=8;
			else if(val<87) cnt += 9;
			else cnt+=10;
		}
		System.out.println(cnt);
	
	}
	
}
