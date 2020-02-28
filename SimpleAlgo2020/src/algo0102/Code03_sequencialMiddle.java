package algo0102;

public class Code03_sequencialMiddle {

	public static void main(String[] args) {
		int [] data = new int[] {2,3,4,1,8,11};
		int target = 8;
		int result = solution(data, 0, data.length-1, target);
		System.out.println(result);

	}

	private static int solution(int[] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin+end)/2;
			if(data[middle] == target) {
				return middle;
			}
			int index = solution(data, begin, middle-1, target);
			
			if(index != -1) {
				return index;
			} else {
				return solution(data, middle+1, end, target);
			}
		}
		
	}

}
