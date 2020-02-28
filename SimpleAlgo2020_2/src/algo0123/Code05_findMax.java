package algo0123;

public class Code05_findMax {
	public static void main(String[] args) {
		int [] data = {3,2,7,1,5,6};
		int result = findMAX(data, 0, data.length-1);
		System.out.println(result);
	}

	private static int findMAX(int[] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		} else {
			int middle = (begin+end)/2;
			// 마지막에 숫자가 두 개만 남게 되면, 숫자 사이에서 비교가 이루어진다. 
			int max1 = findMAX(data, begin, middle);
			int max2 = findMAX(data, middle+1, end);
			
			return Math.max(max1, max2);
		}
	}
}
