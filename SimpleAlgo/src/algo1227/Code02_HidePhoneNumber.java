package algo1227;

public class Code02_HidePhoneNumber {

	public static void main(String[] args) {
		
		String str= "01024581245";
		System.out.println(solution(str));

	}

	public static String solution(String phone_number) {
		// 마지막 네 자리만 남기고, 다 별로 바꾸라.
		String answer = "";
		
		String [] temp = phone_number.split("");
		
		for(int i=0; i<temp.length-4; i++) {
			temp[i] = "*";
		}
		
		answer = String.join("", temp);
	
		return answer;
	}

}
