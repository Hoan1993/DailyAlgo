package algo1226;

public class Code04_distinguish {

	public static void main(String[] args) {
		String str = "3452abzxy금백795감김##%@$";
		
		
		String [] temp = CheckNumber(str);
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		

	}
	
	public static String[] CheckNumber(String str){
		char check;
		String [] temp =  new String[3];
		temp[0] = "";
		temp[1] = "";
		temp[2] = "";

		
		for(int i = 0; i<str.length(); i++){
			check = str.charAt(i);
			// 문자형 숫자들을 판멸한다.
			if( check > 48 && check < 58)
			{
				char charT = str.charAt(i);		// 문자열 숫자를 char형 변수 charT에 넣는다
				String t = String.valueOf(charT);	// charT를 String으로 만든다
				temp[0] = temp[0].concat(t);	// concat을 이용해, temp[0]에 문자열을 더한다.
				
			} else if(check >= 'a' && check <='z' || check >= 'A' && check <='Z' ) {
				char charT = str.charAt(i);		// 문자열 숫자를 char형 변수 charT에 넣는다
				String t = String.valueOf(charT);	// charT를 String으로 만든다
				temp[1] = temp[1].concat(t);
			} else {
				char charT = str.charAt(i);		// 문자열 숫자를 char형 변수 charT에 넣는다
				String t = String.valueOf(charT);	// charT를 String으로 만든다
				temp[2] = temp[2].concat(t);
			}
			
		}		
		return temp;
	}

}
