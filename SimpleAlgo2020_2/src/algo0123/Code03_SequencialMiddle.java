package algo0123;

public class Code03_SequencialMiddle {
	public static void main(String[] args) {
		int [] data = {3,2,7,1,5,6};
		int target = 5;
		int result = search(data, target, 0, data.length-1);
		System.out.println(result);
	}

	private static int search(int[] data, int target, int begin, int end) {
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin+end)/2;
			if(data[middle] == target) 
				return middle;
			// 
			int index = search(data, target, begin, middle-1);
			if(index != -1) {
				return index;
			} else {
				return search(data, target, middle+1, end);
			}
			
			
		}
	
	}
}
