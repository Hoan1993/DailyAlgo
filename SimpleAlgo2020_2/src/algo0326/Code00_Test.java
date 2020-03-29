package algo0326;

public class Code00_Test {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		String [] parseResult = new String[3];
		int j = 0;
		//int i = 0;
		int [] delim = new int[3];
		for(int i=0; i<dartResult.length(); i++) {
			if((((int)dartResult.charAt(i) >= 48) && ((int)dartResult.charAt(i) <= 57)) && 
					!(((int)dartResult.charAt(i+1) >= 48) && ((int)dartResult.charAt(i+1) <= 57))) {
				System.out.println(i+1);
				
				delim[j] = i;
				j++;
			} 
		}
		
		for(int i=0; i<delim.length; i++) {
			System.out.print(delim[i]+" ");
		}
		System.out.println();
		
		parseResult[0] = dartResult.substring(delim[0], delim[1]);
		parseResult[1] = dartResult.substring(delim[1], delim[2]);
		parseResult[2] = dartResult.substring(delim[2]);
		
		for(int i=0; i<parseResult.length; i++) {
			System.out.println(parseResult[i]);
		}

		System.out.println("===================");
		int [] tempSum = new int[3]; 
		for (int i = 0; i < parseResult.length; i++) {
			
			if (parseResult[i].charAt(1) == 'S') {
				int num = Character.getNumericValue(parseResult[i].charAt(0));
				num = num * 1;
				tempSum[i] = num;
				
				System.out.println(num);
			} else if (parseResult[i].charAt(1) == 'D') {
				int num = Character.getNumericValue(parseResult[i].charAt(0));
				num = num * num;
				tempSum[i] = num;
				System.out.println(num);
			} else if (parseResult[i].charAt(1) == 'T') {
				int num = Character.getNumericValue(parseResult[i].charAt(0));
				num = num * num * num;
				tempSum[i] = num;
				System.out.println(num);
			}

		}
		int [] eventDelim = new int[3];
		for (int i = 0; i < parseResult.length; i++) {
			if(parseResult[i].length() >= 3) {
				eventDelim[i] = event(parseResult[i]);
			} else {
				eventDelim[i] = 0;
			}
		}
		
		
		
		for(int i=0; i<tempSum.length; i++) {
			System.out.println(tempSum[i]);
		}
		System.out.println();
		for(int i=0; i<eventDelim.length; i++) {
			System.out.println(eventDelim[i]);
		}
		
		System.out.println("==========================");
		
		for (int i = 0; i < parseResult.length; i++) {
			
			if (parseResult[i].charAt(1) == 'S') {
				int num = Character.getNumericValue(parseResult[i].charAt(0));
				num = num * 1;
				tempSum[i] = num;
				if(eventDelim[i] == 1 || ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1)) {
					tempSum[i] = tempSum[i]*2;
				} else if(eventDelim[i] == 2) {
					tempSum[i] = tempSum[i]*-1;
				}
				System.out.println(tempSum[i]);
			} else if (parseResult[i].charAt(1) == 'D') {
				int num = Character.getNumericValue(parseResult[i].charAt(0));
				num = num * num;
				tempSum[i] = num;
				if(eventDelim[i] == 1 || ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1)) {
					tempSum[i] = tempSum[i]*2;
				} else if(eventDelim[i] == 2) {
					tempSum[i] = tempSum[i]*-1;
				}
				System.out.println(tempSum[i]);
			} else if (parseResult[i].charAt(1) == 'T') {
				int num = Character.getNumericValue(parseResult[i].charAt(0));
				num = num * num * num;
				tempSum[i] = num;
				if(eventDelim[i] == 1 || ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1)) {
					tempSum[i] = tempSum[i]*2;
				} else if(eventDelim[i] == 2) {
					tempSum[i] = tempSum[i]*-1;
				}
				System.out.println(tempSum[i]);
			}

		}
		int answer = 0;
		System.out.println("===========================");
		for(int i=0; i<tempSum.length; i++) {
			answer += tempSum[i];
			System.out.println(tempSum[i]);
		}
		System.out.println("최종");
		System.out.println(answer);
		
		

	}

	private static int event(String string) {
		int result = 0;
		if(string.charAt(2) == '*') {
			result = 1;
		} else if(string.charAt(2) == '#') {
			result = 2;
		}
		
				
		return result;
	}
}
