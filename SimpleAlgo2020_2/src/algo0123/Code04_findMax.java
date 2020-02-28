package algo0123;

public class Code04_findMax {

	public static void main(String[] args) {
		int [] data = {3,2,7,1,5,6};
		int result = search(data, 0, data.length-1);
		System.out.println(result);
	
	}

	private static int search(int[] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		} else {
			return Math.max(data[begin], search(data, begin+1, end));
		}
	}

}
