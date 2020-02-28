package algo0123;

import java.util.Arrays;

public class Code06_BinarySearch {

	public static void main(String[] args) {
		String [] data = {"brian", "adam", "christ", "droid", "ellen"};
		String target = "christ";
		Arrays.sort(data);
		int result = binarySearch(data, target, 0, data.length);
		System.out.println(result);
	
	}

	private static int binarySearch(String[] data, String target, int begin, int end) {
		// 못 찾는 경우
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin+end)/2;
			int compResult = target.compareTo(data[middle]);
			if(compResult == 0) {
				return middle;
			} else if(compResult < 0) {
				return binarySearch(data, target, begin, middle-1);
			} else {
				return binarySearch(data, target, middle+1, end);
			}
		}
		
	
	}

}
