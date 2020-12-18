import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
	public static void main(String[] args) {
		int [] progresses= {5,5,5};
		int[] speeds = {21,25,20};
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		for(int i = 0; i<progresses.length; i++) {
			queue.add(
			// 100퍼센트 기준으로 남은 작업량에서 스피드를 계산합니다. 계산 이후에 맞아 떨어지지않은면 몫에 +1를 해줍니다.
			(100-progresses[i]) % speeds[i] ==0?
			(100-progresses[i])/speeds[i] :
			(100-progresses[i])/ speeds[i]+1
			);
		}
		int cnt =1;
		int preQue= queue.poll();
		
		while(!queue.isEmpty()) {
			int pastQue = queue.poll();
			if(preQue >= pastQue) { // 같은 일에 끝나면 ++ 또는 앞 작업이 덜끝나면 ++
				cnt++; 
			}else {
				list.add(cnt);
				cnt=1;
				preQue = pastQue;
				
			}
		}
		list.add(cnt); // 마지막 숫자에 대한 추가작업
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i]  = list.get(i);
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}
}
