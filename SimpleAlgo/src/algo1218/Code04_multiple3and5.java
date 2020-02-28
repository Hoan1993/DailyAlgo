package algo1218;

public class Code04_multiple3and5 {

	public static void main(String[] args) {
		int sum3 = 0;
		int sum5 = 0;
		int sum15 = 0;
		
		int total = 0;
		
		for(int i=1; i<1000; i++) {
			sum3 += calc3(i);
			sum5 += calc5(i);
			sum15 += calc15(i);
		}
		
		total = sum3+ sum5 - sum15;
		System.out.println(sum3);
		System.out.println(sum5);
		System.out.println(sum15);
		System.out.println(total);
		
	}

	private static int calc15(int i) {
		if(i%15 == 0) {
			return i;
		}
		return 0;
	}

	private static int calc5(int i) {
		if(i%5 == 0) {
			return i;
		}
		return 0;
	}

	private static int calc3(int i) {
		if(i%3 == 0) {
			return i;
		}
		return 0;
	}

}
