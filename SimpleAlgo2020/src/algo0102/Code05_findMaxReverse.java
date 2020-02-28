package algo0102;

public class Code05_findMaxReverse {

	public static void main(String[] args) {
		int [] data = new int[] {2,3,5,11,2,7,8};
		int max_num = findMax(data, 0, data.length-1);
		System.out.println(max_num);
	}

	private static int findMax(int[] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		} else {
			int middle = (begin+end)/2;
			int max1 = findMax(data, begin, middle);
			int max2 = findMax(data, middle+1, end);
			
			return Math.max(max1, max2);
		}
		

	}

}
