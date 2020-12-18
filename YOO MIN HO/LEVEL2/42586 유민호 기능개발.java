import java.util.*;

https://programmers.co.kr/learn/courses/30/lessons/42586

public class Function {
	int[] progress;
	int[] speeds;
	int[] result;
	int day;
	int num;
	int resultnum;
	
	public Function(int[] progress, int[] speeds) {
		this.prograss = progress;
		this.speeds = speeds;
	}
	
	void addQueue(Queue<Integer> progressQueue) {
		int length = progress.length;
		for(int i=0;i<length;i++) {
			progressQueue.offer(progress[i]);			
		}
	}
    
	void queuePolling(Queue<Integer> progressQueue) {
        int[] tempresult = new int[100];
		while(!progressQueue.isEmpty()) {
			if(progressQueue.peek()+(day*speeds[num])>=100) {
				progressQueue.poll();
				num++;
                		tempresult[resultnum]++;
				if(!progressQueue.isEmpty()&&progressQueue.peek()+(day*speeds[num])<100) {
					resultnum++;
				}
			}
			else {
				day++;
			}
		}
        result = new int[resultnum+1];
	result = Arrays.copyOf(tempresult, resultnum+1);
	}
	
	int[] getResult() {
		return result;
	}
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Function f = new Function(progresses, speeds);
	Queue<Integer> progressQueue = new LinkedList<Integer>();
	f.addQueue(progressQueue);
	f.queuePolling(progressQueue);
        return f.getResult();
    }
}
