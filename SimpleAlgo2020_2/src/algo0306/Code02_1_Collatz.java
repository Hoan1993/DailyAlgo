package algo0306;

public class Code02_1_Collatz {
	public static void main(String[] args) {
		int num = 1;
		int count = 0;
		
		
		
		while(num != 1) {
			if(num%2 == 0) {
				num =num/2;
			} else if(num%2 != 0) {
				num = num*3+1;
			}
			count++;
		}
		
		System.out.println(count);
		
		
	}
}
