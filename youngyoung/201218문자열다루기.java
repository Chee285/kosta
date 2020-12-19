class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
			if(s.length() ==4 || s.length() ==6) {
				try {
					int num = Integer.parseInt(s);
                    return true;
				}catch(NumberFormatException e){
					answer = false;
                    return answer;
				}
				
				
			}
		return false;
    }
}

/*
* 예시 s   return
* "a234" false
* "!234" true
* 문자열 s의 길이가 4혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
* 
* 문자열 문자열을 int로 변환하는 예외 처리를 해주는 방식을 채택함
*/
