package algo0325;

public class Code00_Test {
	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		String [] parseResult = new String[3];
		int j = 0;
		int i = 0;
		
		while(!(dartResult.length() == i+1)) {
			while(!(((int)dartResult.charAt(i) >= 48) && ((int)dartResult.charAt(i) <= 57))) {
				System.out.println(i+1);
				parseResult[j] += dartResult.charAt(i);
				i++;
				
			} 
			j++;
			
			
		}
		
		for(int k=0; k<parseResult.length; k++) {
			System.out.println(parseResult[k]);
		}
		
		
	}
	
	
	
}
