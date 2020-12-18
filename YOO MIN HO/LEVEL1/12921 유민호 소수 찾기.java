import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12921#
// ko.wikipedia.org/wiki/에라토스테네스의_체

class Solution {
    public int solution(int n) {
        int answer = 0;
		boolean[] primeList = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			primeList[i] = true;
		}
		for(int i=2;(i*i)<=n;i++) {
			if(primeList[i]) {
				for(int j=i*i; j<=n; j+=i) {
					primeList[j] = false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(primeList[i]) {
				answer++;
			}
		}
        return answer;
    }
}
