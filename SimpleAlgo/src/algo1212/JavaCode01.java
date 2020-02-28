package algo1212;

public class JavaCode01 {

	public static void main(String[] args) {
		int n = 20;
		int i = 0;
		while (i < 11) {
			System.out.print((i+1)+". ");
			
			while (n > 0) {

				if (n == 18) {
					System.out.print("*");
				} else {
					System.out.print("o");
				}
				n--;
			}
			System.out.println();
			n = 20;
			i++;
		}
	}
}
