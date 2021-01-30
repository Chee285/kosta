import java.util.Scanner;

// https://jiwontip.tistory.com/m/13?category=316038
// 다음수열

public class Main {
	
	public static boolean permutation(int[] arr) {
		int a = arr.length-1; // 3
		// 뒤에서부터 탐색하면서 a-1보다 a가 더 큰경우 찾음
		while(a>0 && arr[a-1]>=arr[a]) {
			a--;
		}
		if(a<=0) {
			return false;
		}
		
		
		// 다쉬 뒤에서부터 탐색하면서 a-1보다 b가 더 큰경우 찾음
		int b = arr.length-1;
		while(arr[a-1] >= arr[b]) {
			b--;
		}
		
		// a와 b 교환
		int tmp = arr[a-1];
		arr[a-1] = arr[b];
		arr[b] = tmp;
		
		// 오른차순으로 정렬
		int start=a;
		int end = arr.length-1;
		while(start < end) {
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i< num; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(permutation(arr)) {
			for(int i=0; i< num; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}else {
			System.out.println("-1");
		}
		
		
		
	}

}