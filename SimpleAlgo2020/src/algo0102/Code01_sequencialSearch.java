package algo0102;

public class Code01_sequencialSearch {

	public static void main(String[] args) {
		int [] data = new int[] {2,3,4,1,8,11};
		int target = 8;
		int result = solution(data, 0, data.length-1, target);
		System.out.println(result);
	}
	
	public static int solution(int [] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		} else if(data[begin] == target) {
			return begin;
		} else {
			return solution(data, begin+1, end, target);
		}
		
	}

}
