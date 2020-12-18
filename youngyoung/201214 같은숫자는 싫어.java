import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
       
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] !=arr[i+1]){
                numbers.add(arr[i]);
                   
            }
            
        }
        numbers.add(arr[arr.length-1]);
        int[] answer = new int [numbers.size()];
        for(int i=0; i<numbers.size(); i++){
            answer[i] = numbers.get(i);
        }
        
        return answer;
    }
}