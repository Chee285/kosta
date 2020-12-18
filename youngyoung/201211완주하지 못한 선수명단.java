import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		String[] participant = { "marina","josipa","nikola", "vinko","filipa"};
		String[] completion = {"josipa","filipa", "marina","nikola"};
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);


		int cnum = completion.length-1;
	
		for(int i=0; i<participant.length; i++) {
			
			if(i> cnum) {
				cnum = i-1;
				
			}
			if(participant[i].equals(completion[cnum])) {
				participant[i] = "";
			}
		}
		
		for(int k = 0 ; participant.length>k; k++) {
			if(participant[k] != "") {
				 answer =  participant [k];
			}
		}
		
		System.out.println(answer);
	}
}
