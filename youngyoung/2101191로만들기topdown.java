import java.util.Scanner;
import java.util.Stack;
 
// https://www.acmicpc.net/problem/1463
// 1로 만들기
public class Main {
	private static int[] d;
	private static int topDown(int num) {
		if(num==1) {
			return 0;
		}
		if(d[num]>0) {
			
			return d[num];
		}
		d[num] =  topDown(num-1)+1;
		if(num %2 ==0) {
			int tmp = topDown(num/2)+1;
			if(d[num]>tmp) {
				d[num] = tmp;
			}
		}
		if(num%3 ==0) {
			int tmp = topDown(num/3)+1;
			if(d[num] > tmp) {
				d[num] = tmp;
			}
			
		}
		return d[num];
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt();
    	d = new int [num+1];
    	System.out.println(topDown(num));

       
    }
       
}