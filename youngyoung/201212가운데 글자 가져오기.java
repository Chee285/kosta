class Solution {
    public String solution(String answer) {
        
        int answerLen = answer.length();
		answer = answerLen %2==0?answer.substring(answerLen/2-1,answerLen/2+1):answer.substring(answerLen/2, answerLen/2+1);
        return answer;
    }
}