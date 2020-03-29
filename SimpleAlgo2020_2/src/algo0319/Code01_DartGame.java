package algo0319;

public class Code01_DartGame {
	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int answer = solution(dartResult);

		System.out.println(answer);
	}

	private static int solution(String dartResult) {
		String [] splitDartResult = new String[3];
		int z = 0;
		int j = 0;
		for(int i=0; i<3; i++) {
			
			for(j=z; j<dartResult.length(); j++) {
			char temp =dartResult.charAt(j+1);
					if(Character.isDigit(temp) == true) {
						z = j;
						i++;
					}
				splitDartResult[i] += dartResult.charAt(j);
			}
			
				
		}
		
		for(int i=0; i<splitDartResult.length; i++) {
			System.out.println(splitDartResult[i]);
		}
		
		
		
		
		return 0;
	}
	
	


}
