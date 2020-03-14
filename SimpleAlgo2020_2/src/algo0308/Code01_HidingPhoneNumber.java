package algo0308;

public class Code01_HidingPhoneNumber {
	public static void main(String[] args) {
		String phone_number = "027778888";
		String answer = solution(phone_number);
		System.out.println(answer);
	}

	private static String solution(String phone_number) {
		String answer = "";
		
		for(int i=0; i<phone_number.length()-4; i++) {
			answer += "*";
		}
		
		for(int i=phone_number.length()-4; i<phone_number.length(); i++) {
			answer += phone_number.charAt(i);
		}
		
		
		return answer;
	}
}
