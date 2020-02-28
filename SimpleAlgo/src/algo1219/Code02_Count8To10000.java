package algo1219;

public class Code02_Count8To10000 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=10000; i++) {
			String temp = Integer.toString(i);
			String [] str = temp.split("");
			for(int j=0; j<str.length; j++) {
				if(str[j].equals("8")) {
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
		
		
	}

}
