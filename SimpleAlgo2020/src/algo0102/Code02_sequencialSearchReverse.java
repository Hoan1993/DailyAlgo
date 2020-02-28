package algo0102;

public class Code02_sequencialSearchReverse {

	public static void main(String[] args) {
		int [] data = new int[] {2,3,4,1,8,11};
		int target = 8;
		int result = solution(data, 0, data.length-1, target);
		System.out.println(result);

	}
	public static int solution(int [] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
			
		} else if(target == data[end]) {
			return end;
		} else {
			return solution(data, begin, end-1, target);
		}
	}
}
