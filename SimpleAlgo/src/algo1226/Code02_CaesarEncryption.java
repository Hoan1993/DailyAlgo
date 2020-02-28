package algo1226;

public class Code02_CaesarEncryption {

	public static void main(String[] args) {
		String str = solution("ABCDEDF ABCD eijf lwj ljlw j zxzy", 2);
		System.out.println(str);

	}

	private static String solution(String string, int n) {
		String str = "";
		// char [] temp = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 32) {
				char charT = (char) string.charAt(i);
				String t = String.valueOf(charT);
				str = str.concat(t);
				i++;
			}

			int temp = string.charAt(i) + n;
			if (temp > (int) 'z') {
				temp = temp - 26;
			}

			char charT = (char) temp;
			String t = String.valueOf(charT);
			str = str.concat(t);
		}

		return str;
	}

}
