package algo1213;

public class Code01_toBiOcDeci {

	public static void main(String[] args) {
		toBinary(15);
		System.out.println();
		toOctal(15);
		System.out.println();
		toDecimal(327);

	}
	
	public static void toBinary(int num) {
		if(num == 0) {
			return;
		} else {
		toBinary(num /2);
		System.out.print(num%2);
		
		
		}
	}
	
	public static void toOctal(int num) {
		if(num == 0) {
			return;
		} else {
		toOctal(num /8);
		System.out.print(num%8);	
		
		}
	}
	
	public static void toDecimal(int num) {
		if (num == 0) {
			return;
		} else {
			toDecimal(num / 16);
			if (num % 16 == 10) {
				System.out.print("A");
			} else if (num % 16 == 11) {
				System.out.print("B");
			} else if (num % 16 == 12) {
				System.out.print("C");
			} else if (num % 16 == 13) {
				System.out.print("D");
			} else if (num % 16 == 14) {
				System.out.print("E");
			} else if (num % 16 == 15) {
				System.out.print("F");
			} else
				System.out.print(num % 16);

		}
	}

}
