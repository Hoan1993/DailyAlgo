package algo1220;

public class Code06_FromStringToNumber {

	public static void main(String[] args) {
		int a= solution("-1234");
		System.out.println(a);
	}

	public static int solution(String s) {
		int answer = 0;
		// 배열로 바꾼다.
		String[] str = s.split("");
		
		if (str[0].equals("-") || str[0].equals("+")) {
			String[] temp = new String[(str.length - 1)];
			for (int i = 1; i < (str.length); i++) {
				temp[i-1] = str[i];
			}
				if(str[0].equals("-")) {
				String strNum = String.join("", temp);
				answer = Integer.parseInt(strNum);
				answer *= -1;
				return answer;
				} 
					
		}
		String strNum = String.join("", str);
		answer = Integer.parseInt(strNum);

		return answer;
	}
}
