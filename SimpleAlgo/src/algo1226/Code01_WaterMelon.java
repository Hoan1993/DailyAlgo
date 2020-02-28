package algo1226;

public class Code01_WaterMelon {

	public static void main(String[] args) {
		String str =solution(5);
		System.out.println(str);
	}

	private static String solution(int n) {
		String str = "";
		if (n % 2 == 0) {
			for (int i = 0; i < (n / 2); i++) {
				str = str.concat("수박");
			}

		} else {
			for (int i = 0; i < (n / 2); i++) {
				str = str.concat("수박");
			}
			str = str.concat("수");
		}
		
		return str;
	}

}
