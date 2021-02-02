import java.util.Scanner;

// https://www.acmicpc.net/problem/20299
// 3대 측정
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int arr[] = new int[n*3]; 
		int arrlength = 0;
		int cnt =0;
		
		for(int i =0; i<n; i++) {
			int sum=0;
			int[] arrtemp= new int[3];
			int cnttemp =0;
			for(int j = 0; j<3; j++) {
				arrtemp[j] = sc.nextInt();
				sum += arrtemp[j];
				if(arrtemp[j] >= l) {
					cnttemp++;
				}
			}
			
			if(sum>k && cnttemp ==3) {
				cnt++;
				for(int a =0; a<3; a++) {
					arr[arrlength] = arrtemp[a];
					arrlength++;
				}
			}
			
		}
		System.out.println(cnt);
		for(int i=0; i< arrlength; i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}