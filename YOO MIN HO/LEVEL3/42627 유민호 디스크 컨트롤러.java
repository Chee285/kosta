import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// https://programmers.co.kr/learn/courses/30/lessons/42627
// 우선순위큐(최소힙)을 이용한 문제



public class Solution {
	public static class DiskJob implements Comparable<DiskJob>{
		int start;
		int runningtime;
		
		public DiskJob(int start, int runningtime) {
			this.start = start;
			this.runningtime = runningtime;
		}
		
		@Override
		public int compareTo(DiskJob d) {
			return this.runningtime - d.runningtime;
		}
	}
	
	public int solution(int[][] jobs) {
		int answer = 0;
		int i = 0;
		int time = 0;
		PriorityQueue <DiskJob> pq = new PriorityQueue<>(); // 최소 힙
		
		Arrays.sort(jobs, new Comparator<int[]>() { // 배열 첫번째 인덱스로 오름차순 정렬
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		while(i<jobs.length||!pq.isEmpty()) {
			if(i<jobs.length && time>=jobs[i][0]) { // 배열 아직 남아있고 시작시간이 현재시간보다 작거나 같을때
				pq.add(new DiskJob(jobs[i][0], jobs[i][1]));
				i++;
				continue;
			}
			if(!pq.isEmpty()) { // 큐에 작업이 남아있다면
				time += pq.peek().runningtime;
				answer += time - pq.peek().start;
				pq.poll();
			}
			else { // 큐에 작업이 없다면
				time = jobs[i][0];
			}
		}
		return answer / jobs.length;
	}
}