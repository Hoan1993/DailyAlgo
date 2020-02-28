package algo0224;

public class Code02_toBinary {
	public static void main(String[] args) {
		int num = 10;
		toBinary(num);
	}

	private static void toBinary(int num) {
		if(num < 2) {
			System.out.print(num);
		} else {
			toBinary(num/2);
			System.out.print(num%2);
		}
		
		
		
	}
}
