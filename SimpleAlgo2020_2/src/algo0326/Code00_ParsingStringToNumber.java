package algo0326;

public class Code00_ParsingStringToNumber {
	public static void main(String[] args) {
		String dartResult = "1T2D3D#";
		String [] parseResult = new String[3];
		int j = 0;
		int [] num = new int[3];
		//int i = 0;
		
		// ((i+1 < dartResult.length())?!(((int)dartResult.charAt(i+1) >= 48) && ((int)dartResult.charAt(i+1) <= 57)):
		
		int [] delim = new int[3];
		for(int i=0; i<dartResult.length(); i++) {
			if(num[2] != 0) {
				break;
			}
			
			if(((((int)dartResult.charAt(i) >= 48) && ((int)dartResult.charAt(i) <= 57)) && 
					!(((int)dartResult.charAt(i+1) >= 48) && ((int)dartResult.charAt(i+1) <= 57)))) {
				//System.out.println(i+1);
				if(i-1 >= 0 && !(((int)dartResult.charAt(i-1) >= 48) && ((int)dartResult.charAt(i-1) <= 57))) {
					delim[j] = i;
					
				}
				num[j] = Character.getNumericValue(dartResult.charAt(i));
				j++;
			} else if(((((int)dartResult.charAt(i) >= 48) && ((int)dartResult.charAt(i) <= 57)) && 
					(((int)dartResult.charAt(i+1) >= 48) && ((int)dartResult.charAt(i+1) <= 57)))){
				num[j] = 10;
				delim[j] = i;
				j++;
				i++;
			}
		}
		System.out.println("============================");
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("============================");
		for(int i=0; i<delim.length; i++) {
			System.out.println(delim[i]);
		}
		
		System.out.println("============================");
		parseResult[0] = dartResult.substring(delim[0], delim[1]);
		parseResult[1] = dartResult.substring(delim[1], delim[2]);
		parseResult[2] = dartResult.substring(delim[2]);
		
		System.out.println("길이 ==> "+parseResult.length);
		
		
		for(int i=0; i<parseResult.length; i++) {
			System.out.println(parseResult[i]);
		}
		System.out.println("============================");
		int k = 0;
		int [] tempSum = new int[3]; 
		for (int i = 0; i < parseResult.length; i++) {
			
			if (parseResult[i].charAt(1) == '0'?
					parseResult[i].charAt(2) == 'S':parseResult[i].charAt(1) == 'S') {
				int tempnum = num[k++];
				tempnum = tempnum * 1;
				tempSum[i] = tempnum;
			
			} else if (parseResult[i].charAt(1) == '0'?
					parseResult[i].charAt(2) == 'D':parseResult[i].charAt(1) == 'D') {
				int tempnum = num[k++];
				tempnum = tempnum * tempnum;
				tempSum[i] = tempnum;
				
			} else if (parseResult[i].charAt(1) == '0'?
					parseResult[i].charAt(2) == 'T':parseResult[i].charAt(1) == 'T') {
				int tempnum = num[k++];
				tempnum = tempnum * tempnum * tempnum;
				tempSum[i] = tempnum;
				
			}

		}
		System.out.println("============================");
		for(int i=0; i<tempSum.length; i++) {
			System.out.println(tempSum[i]);
		}
		System.out.println("111111111111111111111111");
		int answer = 0;
		for(int i=0; i<tempSum.length; i++) {
			answer += tempSum[i];
		}
		System.out.println("============================");
		System.out.println(answer);
		
		int [] eventDelim = new int[3];
		for (int i = 0; i < parseResult.length; i++) {
			if(parseResult[i].length() >= 3 && 
					!(parseResult[i].length() == 3 && parseResult[i].charAt(1) == '0')) {
				eventDelim[i] = event(parseResult[i]);
			} else {
				eventDelim[i] = 0;
			}
	
		}
		System.out.println("*****************************");
		for(int i=0; i<eventDelim.length; i++) {
			System.out.println(eventDelim[i]);
		}
		System.out.println("******************************");
		k = 0;
		for (int i = 0; i < parseResult.length; i++) {
			
			if (parseResult[i].charAt(1) == '0'?
					parseResult[i].charAt(2) == 'S':parseResult[i].charAt(1) == 'S') {
				int tempnum = num[k++];
				tempnum = tempnum * 1;
				tempSum[i] = tempnum;
				
				if(eventDelim[i] == 1 && ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1) && i!=2) {
					tempSum[i] = tempSum[i]*2*2;
				} else if(eventDelim[i] == 1 || ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1)) {
					tempSum[i] = tempSum[i]*2;
				} 
				if(eventDelim[i] == 2) {
					tempSum[i] = tempSum[i]*(-1);
				}
				System.out.println(tempSum[i]);
			} else if (parseResult[i].charAt(1) == '0'?
					parseResult[i].charAt(2) == 'D':parseResult[i].charAt(1) == 'D') {
				int tempnum = num[k++];
				tempnum = tempnum * tempnum;
				tempSum[i] = tempnum;
				if(eventDelim[i] == 1 && ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1) && i!=2) {
					tempSum[i] = tempSum[i]*2*2;
				} else if(eventDelim[i] == 1 || ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1)) {
					tempSum[i] = tempSum[i]*2;
				} 
				if(eventDelim[i] == 2) {
					tempSum[i] = tempSum[i]*(-1);
				}
				System.out.println(tempSum[i]);
			} else if (parseResult[i].charAt(1) == '0'?
					parseResult[i].charAt(2) == 'T':parseResult[i].charAt(1) == 'T') {
				int tempnum = num[k++];
				tempnum = tempnum * tempnum * tempnum;
				tempSum[i] = tempnum;
				if(eventDelim[i] == 1 && ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1) && i!=2) {
					tempSum[i] = tempSum[i]*2*2;
				} else if(eventDelim[i] == 1 || ((i+1 < eventDelim.length)?eventDelim[i+1]==1:eventDelim[i]==1)) {
					tempSum[i] = tempSum[i]*2;
				} 
				if(eventDelim[i] == 2) {
					tempSum[i] = tempSum[i]*(-1);
				}
				System.out.println(tempSum[i]);
			}

		}
		answer = 0;
		for(int i=0; i<tempSum.length; i++) {
			answer += tempSum[i];
		}
		System.out.println("============================");
		System.out.println("이게 답이었으면 ==> "+answer);
		
		
		
	}
	
	private static int event(String string) {
		int result = 0;
		
		if(string.charAt(1) == '0'?
					string.charAt(3) == '*':string.charAt(2) == '*') {
			result = 1;
		} else if(string.charAt(1) == '0'?
					string.charAt(3) == '#':string.charAt(2) == '#') {
			result = 2;
		} 
		
				
		return result;
	}

}
