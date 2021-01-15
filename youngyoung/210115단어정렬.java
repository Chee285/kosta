import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1181
// 단어정렬
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[13];
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[i].length() > arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(arr[0]);
		for (int i = 1; i < num; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}

	}
}

---------------------------------------------------------------------------


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1181
// 단어정렬
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] arr = new String[num];
		
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextLine();
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length() - o2.length();
				}
				
			}
			
		});
		
		
		System.out.println(arr[0]);
		for (int i = 1; i < num; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}

	}
}
