package algo0123;

public class Code01_SequencialSearch {
	public static void main(String[] args) {
		int [] data = {3,2,7,1,5,6};
		int target = 6;
		int result = search(data, target, 0, data.length-1);
		System.out.println(result);
		
	}

	private static int search(int[] data, int target, int begin, int end) {
		// begin이 end보다 큰 상황은
		// 끝까지 찾아도 없는 것.
		
		if(begin > end) {
			return -1;
		} else if(data[begin] == target){
			return begin;
		} else {
			return search(data, target, begin+1, end);
		}
		
	}
	
	
	
	
}
