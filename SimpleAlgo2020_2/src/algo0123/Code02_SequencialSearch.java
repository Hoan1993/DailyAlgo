package algo0123;

public class Code02_SequencialSearch {
	public static void main(String[] args) {
		int [] data = {3,2,7,1,5,6};
		int target = 5;
		int result = search(data, target, 0, data.length-1);
		System.out.println(result);
	}

	private static int search(int[] data, int target, int begin, int end) {
		if(begin > end) {
			return -1;
		} else if(target == data[end]) {
			return end;
		} else {
			return search(data, target, begin, end-1);
		}

	}
}
