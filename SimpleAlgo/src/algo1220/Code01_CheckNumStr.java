package algo1220;

public class Code01_CheckNumStr {

	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "abce";
		
		boolean strCheck1 =CheckNumber(str1);
		
		boolean strCheck2 = CheckNumber(str2);
		
		System.out.println(strCheck1);
		System.out.println(strCheck2);
		
	}

	
	public static boolean CheckNumber(String str){
		char check;
		
		if(str.equals(""))
		{
			//문자열이 공백인지 확인
			return false;
		}
		
		for(int i = 0; i<str.length(); i++){
			check = str.charAt(i);
			if( check < 48 || check > 58)
			{
				//해당 char값이 숫자가 아닐 경우
				return false;
			}
			
		}		
		return true;
	}
}
