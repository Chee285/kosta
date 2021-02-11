import java.io.*;

// https://www.acmicpc.net/problem/2884
// 알람시계
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (minute >= 45) {
			minute = minute - 45;

			System.out.println(hour + " " + minute);
		}else {
			int after = 60 - 45;
			minute +=after; 
			if(hour !=0) {
				hour--;
			}else {
				hour = 23;
			}
			System.out.println(hour +" "+ minute);
		}
	}
}