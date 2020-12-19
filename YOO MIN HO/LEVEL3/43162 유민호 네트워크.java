import java.util.ArrayList;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/43162
//DFS(재귀함수 대신 Stack을 이용)

class Solution {
    public int solution(int n, int[][] computers) {
		int answer = 1;
		Stack<Integer> DFSstack = new Stack<Integer>();
		ArrayList<Integer> nodevisit = new ArrayList<Integer>(n);
		nodevisit.add(1);
		for(int i=1;i<n;i++) {
			nodevisit.add(0);
		}
		boolean[] check = new boolean[n]; 
		
		int row = 0;
		
		while(nodevisit.contains(0)) { // 방문배열이 모두 1이 아니면 -> 0이 하나라도 있으면
			nodevisit.set(row, 1);
			for(int col=0;col<computers[0].length;col++) { // 다음 방문 노드를 스택에 push
				if(row!=col&&computers[row][col]==1) {
					if(nodevisit.get(col)==0) {
						DFSstack.push(col);
					}
				}
			}
			if(!DFSstack.isEmpty()) { // 스택이 있으면 -> 이어진 길이 있다.
				row = DFSstack.pop();
			}
			else { // 스택이 없으면 -> 이어진 길이 없다.
				if(nodevisit.contains(0)) { // 탐색하지 않은 노드가 남음
					row = nodevisit.indexOf(0);
					answer++;
				}
			}
		}
		return answer;
	}
}
