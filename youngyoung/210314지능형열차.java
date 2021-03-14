import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
 
// https://www.acmicpc.net/problem/2455
// 지능형 기차
public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int[] inarr = new int[4];
    	int[] outarr = new int[4];
    	int max = 0;
    	int now = 0;
    	
    	for(int i=0; i<4; i++) {
    		outarr[i] = sc.nextInt();
    		inarr[i] = sc.nextInt();
    		
    		now += inarr[i] - outarr[i];
    		if(max < now) {
    			max = now;
    		}
    	}
    	System.out.println(max);
    	
    	
    }
    
}
