package algo0102;

public class Code04_findMax {

	public static void main(String[] args) {
		int [] data = new int[] {2,3,5,11,2,7,8};
		int max_num = findMax(data, 0, data.length-1);
		System.out.println(max_num);
	}

	private static int findMax(int[] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		} else {
			return Math.max(data[begin], findMax(data, begin+1, end));
			
		}
	
	}

}
