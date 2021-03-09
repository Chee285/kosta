import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1094
// 막대기
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 막대기
		int stick = sc.nextInt();
		int half = 32;
		int compare = 0;
		int branch = 0;
		
		if(stick == 64) {
			branch = 1; 
		}else {
			while(true) {
				if(stick == compare + half) {
					branch++;
					break;
				}else if(stick > compare + half){
					compare += half;
					branch++;
					half = half /2;
				}else if(stick  < compare + half) {
					half = half/2;
				}
			}
		}
		System.out.println(branch);
		
	}
}