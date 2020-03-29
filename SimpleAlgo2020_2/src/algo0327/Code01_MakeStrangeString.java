package algo0327;

public class Code01_MakeStrangeString {
	public static void main(String[] args) {
		String s = "try hello world";
		
		String answer = solution(s);
		
		System.out.println(answer);
	}

	private static String solution(String s) {
		System.out.println(s.charAt(s.length()-1));
		int tempResult = 0;
		if(s.charAt(s.length()-1) == ' ') {
			tempResult = 1;
		}
		
		System.out.println("여기 공백 있어요?"+tempResult);
		
		
		s = s.trim().replaceAll(" +", " ");
		
	
		String answer = "";
		String [] temp = s.split(" ");
		
		if(tempResult == 1) {
			temp[temp.length-1] += " ";
		}
		
		System.out.println("==================");
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println("temp[2]의 크기"+temp[2].length());
		System.out.println("==================");
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length(); j++) {
				
				if(j%2==0) {
					String tempS = String.valueOf(temp[i].charAt(j));
					String tem = tempS.toUpperCase();
					answer = answer.concat(tem);
					System.out.println(answer);
				} else {
					String tempS = String.valueOf(temp[i].charAt(j));
					String tem = tempS.toLowerCase();
					answer = answer.concat(tem);
					System.out.println(answer);
				}
			}
			if(i < temp.length-1) {
			answer = answer.concat(" ");
			}
		}
		/*
		 * System.out.println("====================="); for(int i=0; i<result.length;
		 * i++) { for(int j=0; j<result[i].length; j++) {
		 * System.out.print(result[i][j]); }
		 * 
		 * System.out.println(); } System.out.println("=====================");
		 * 
		 * System.out.println("====================="); for(int i=0; i<temp.length; i++)
		 * { System.out.println(temp[i]); } System.out.println("=====================");
		 */
		System.out.println("===================");
		System.out.println("+++"+answer+"+++");
		return "hi";
	}
	
	
}
