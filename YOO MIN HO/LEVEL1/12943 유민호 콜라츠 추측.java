// https://programmers.co.kr/learn/courses/30/lessons/12943

class Solution {  
    public int solution(long num) {
        return doCollatz(num);
    }
    
    private static int doCollatz(long num){
        for(int count=0;count<500;count++){
            if(num!=1){
                num = num%2==0?num/2:num*3+1;
            }
            else{
                return count;
            }
        }
        return -1;
    }
}
