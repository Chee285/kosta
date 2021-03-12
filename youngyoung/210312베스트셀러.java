import java.util.Arrays;
import java.util.Scanner;
 
// https://www.acmicpc.net/problem/1302
// 베스트셀러
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        
        // 입력한 숫자만큼 소설책을 받음
        for(int i =0; i<num; i++) {
        	arr[i] = sc.next();
        }
        
        // 정렬
        Arrays.sort(arr);
        
        int cnt = 0;
        int max = 0;
        String temp = arr[0];
        String result = "";
        for(int i=0; i<arr.length; i++) {
        	//책 제목이 같을 경우
        	if(arr[i].equals(temp)) {
        		cnt++;
        	}
        	// 책제목이 다를경우
        	else {
        		if(cnt > max) {
        			max = cnt;
        			result = temp;
        		}
        		
        		temp = arr[i];
        		cnt =1;
        	}
        }
        
        if(cnt > max) {
        	result = temp;
        }
        System.out.println(result);
        
        
    }
}
