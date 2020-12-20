import java.util.HashMap;

// https://programmers.co.kr/learn/courses/30/lessons/42576
// https://jhnyang.tistory.com/120 해시 적용하는게 힘들다면 여기 참조


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String name : participant) {
			map.put(name, map.getOrDefault(name, 0)+1);
		}
		
		for(String name : completion) {
			map.put(name, map.get(name)-1);
		}
		for(String name : map.keySet()) {
			if(map.get(name)!=0) {
				answer = name;
				break;
			}
		}
        return answer;
    }
}