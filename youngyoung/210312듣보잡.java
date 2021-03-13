import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
 
// https://www.acmicpc.net/problem/1764
// 듣보잡
public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(); // 듣어보지도 못한사람 수
    	int m = sc.nextInt(); // 보지도 못한 사람 수
    	HashSet<String> hs= new HashSet<String>();
    	ArrayList<String> ans = new ArrayList<String>();
    	
    	for( int i=0; i<n; i++) {
    		hs.add(sc.next());
    	}
    	for(int i=0; i<m; i++) {
    		String str = sc.next();
    		if(hs.contains(str)) {
    			ans.add(str);
    		}
    	}
    	Collections.sort(ans);
    	System.out.println(ans.size());
    	
    	for(int i=0; i<ans.size();i++) {
    		System.out.println(ans.get(i));
    	}
    	
    	
    	
    }
    
}
