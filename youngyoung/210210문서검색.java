import java.io.*;

// https://www.acmicpc.net/problem/1543
// 문서 검색
import java.util.*;
public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String sen = sc.nextLine();
    	String search = sc.nextLine();
    	int cnt =0;
    	for(int i =0; i<sen.length() - search.length()+1; i++) {
    		if(sen.substring(i, i+search.length()).equals(search)) {
    			cnt++;
    			i+= search.length();
    			i--;
    		}
    		else {
    			continue;
    		}
    		
    		
    	}
    	System.out.println(cnt);
    }
}