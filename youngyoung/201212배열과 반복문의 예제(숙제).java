package homework;

public class Main {
	 public static void main(String []args){
	        // 1. 다음 금액을 최소동전개수로 환전하시오
	        int money =1243;
	        int[] moneyCnt = {500,100,50,10,1};
	        for(int i = 0; i<moneyCnt.length; i++) {
	        	System.out.print(moneyCnt[i]+"원 : "+ money/moneyCnt[i]+", ");
	        	money %=moneyCnt[i];
	        }
	        
	        
			System.out.println();
			// 2. 숫자 1,2,3,4,5,6,7,8,9,10까지 for문으로 출력하시오
			for(int i=1; i<11; i++) {
				System.out.print(i + ", ");
			}
			System.out.println();
			
			// 3. 알파벳 'A','B','C' ...'Z'을 출력하시오
			for(int i = 65; i<91; i++){
			    char al = (char)i;
			    System.out.print(al+", ");
			}
			System.out.println();
			
			// 4. 피보나치 수열 10개를 출력하시오
			int startNum =0;
			int secondNum =1;
			int sum =1;
			for(int i=0; i<10; i++){
			    
			    System.out.print(sum+ ", ");
			    sum = startNum +secondNum;
			    startNum = secondNum;
			    secondNum = sum;
			    
			}System.out.println();
			
			// 5. 년도에 해당하는 동물을 출력하세요
			int year =2020;
			int yaerAnimal = year%12;
			switch(yaerAnimal){
			    case 0: System.out.println("원숭이띠입니다");break;
			    case 1: System.out.println("닭띠입니다");break;
			    case 2: System.out.println("개띠입니다");break;
			    case 3: System.out.println("돼지띠입니다");break;
			    case 4: System.out.println("쥐띠입니다");break;
			    case 5: System.out.println("소이띠입니다");break;
			    case 6: System.out.println("호랑이띠입니다");break;
			    case 7: System.out.println("토끼띠입니다");break;
			    case 8: System.out.println("용띠입니다");break;
			    case 9: System.out.println("뱀띠입니다");break;
			    case 10: System.out.println("말띠입니다");break;
			    case 11: System.out.println("양띠입니다.");break;
			   
			    
			}
			
			
			// 6. 다음 numArr 배열은 1부터 10사이의 숫자들로 구성되어있다. 숫자들의
			//    출현회수를 출력하시오
			int[] numArr = {1,3,1,10,3,5,8,3,10,2,3};
			int cnt=0;
			for(int i=1; i<=10; i++) {
				cnt=0;
				for(int j=0; j<numArr.length; j++) {
					if(i ==numArr[j]) {
						cnt++;
					}
				}
				System.out.println(i+"의 출현횟수는 "+cnt+ "회");
			}
			
			
			
			
	     }
}
