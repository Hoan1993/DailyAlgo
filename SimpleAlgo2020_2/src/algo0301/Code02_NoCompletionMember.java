package algo0301;

import java.util.Arrays;

public class Code02_NoCompletionMember {
	public static void main(String[] args) {
		String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String [] completion = {"josipa", "filipa", "marina", "nikola"};
		
		String result = solution(participant, completion);
		
		System.out.println(result);
	}
	
    private static String solution(String[] participant, String[] completion) {
        String answer = "";
        int index = -1;
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++) {
        	if(completion[i].equals(participant[i]) == false) {
        		index = i;
        		answer = participant[index];
        		break;
        	}
        }
        
        
        if(index== -1) {
        	answer = participant[participant.length-1];
        }

        
        return answer;
    }
}
