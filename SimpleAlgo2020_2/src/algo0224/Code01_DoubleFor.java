package algo0224;

public class Code01_DoubleFor {
	public static void main(String[] args) {
		int num = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", num++);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", (5*j+i));
				
			}
			System.out.println();
		}
		
		
	}
}
