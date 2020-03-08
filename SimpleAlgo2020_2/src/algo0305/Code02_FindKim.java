package algo0305;

public class Code02_FindKim {

	public static void main(String[] args) {
		String [] seoul = {"Jo", "Kim"};
		
		int index = solution(seoul);
		
		System.out.println(index);

	}

	private static int solution(String[] seoul) {
		int num = 0;
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equalsIgnoreCase("Kim")) {
				num = i;
				break;
			}
			
			
		}
		
		
		return num;
	}

}
