import java.util.Scanner;
//https://codeup.kr/problem.php?id=1425
class Main{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			int front = sc.nextInt();
			int[] stand = new int[num];
			
			int cnt=0;
			
			for(int i=0; i<stand.length; i++) {
				stand[i] = sc.nextInt();
			}
			
			int temp = 0;
			//오름차순으로 재정렬
			for(int i=0; i<num-1; i++) {
				for(int j =i+1; j<num; j++) {
					if(stand[i]>stand[j]) {
						temp = stand[i];
						stand[i] = stand[j];
						stand[j] = temp;
					}
				}
			}
			
			for(int i=0; i<num; i++) {
				System.out.print(stand[i]+" ");
				cnt ++;
				if(cnt%front ==0 ) {
					System.out.println();
				}
			}
		}
	
}
