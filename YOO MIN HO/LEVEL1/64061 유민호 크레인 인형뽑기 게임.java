import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/64061
//스택을 이용한 간단한 문제

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> rstack = new Stack<Integer>();
		Stack<Integer>[] lstack = new Stack[board.length];
        
        for(int i=0;i<lstack.length;i++) {
		lstack[i] = new Stack<Integer>();
	}
        
        for(int col=0;col<board[0].length;col++) { 
		for(int row=board.length-1;row>=0;row--) {
			if(board[row][col]!=0) {
				lstack[col].push(board[row][col]);
			}
		}
	}
        
        for(int i=0;i<moves.length;i++) {
		if(!lstack[moves[i]-1].isEmpty()) {
			if(!rstack.isEmpty()) {
				if(rstack.peek()==lstack[moves[i]-1].peek()) {
					answer+=2;
					rstack.pop();
					lstack[moves[i]-1].pop();
				}
				else {
					rstack.push(lstack[moves[i]-1].pop());
				}
			}
			else {
				rstack.push(lstack[moves[i]-1].pop());
			}
		}
	}
        return answer;
    }
}
